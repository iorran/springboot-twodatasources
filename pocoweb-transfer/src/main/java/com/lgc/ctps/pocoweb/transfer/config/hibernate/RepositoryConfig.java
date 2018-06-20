package com.lgc.ctps.pocoweb.transfer.config.hibernate;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableJpaRepositories(
        entityManagerFactoryRef = "edmEntityManagerFactory",
        transactionManagerRef = "edmTransactionManager",
        basePackages = {"com.lgc.ctps.pocoweb.transfer.repository.openwells"})
public class RepositoryConfig {
    @Autowired
    private JpaVendorAdapter jpaVendorAdapter;

    @Autowired
    @Qualifier("edmDataSource")
    private DataSource dataSource;

    @Bean(name = "entityManager")
    public EntityManager entityManager() {
        return entityManagerFactory().createEntityManager();
    }

    @Primary
    @Bean(name = "edmEntityManagerFactory")
    public EntityManagerFactory entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(dataSource);
        emf.setJpaVendorAdapter(jpaVendorAdapter);
        emf.setPackagesToScan("com.lgc.ctps.pocoweb.transfer.domain.openwells");
        emf.setJpaProperties(properties());
        emf.setPersistenceUnitName("default");   // <- giving 'default' as name
        emf.afterPropertiesSet();
        return emf.getObject();
    }

    private Properties properties() {
        Properties properties = new Properties();
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");
        return properties;
    }

    @Bean(name = "edmTransactionManager")
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager tm = new JpaTransactionManager();
        tm.setEntityManagerFactory(entityManagerFactory());
        return tm;
    }
}