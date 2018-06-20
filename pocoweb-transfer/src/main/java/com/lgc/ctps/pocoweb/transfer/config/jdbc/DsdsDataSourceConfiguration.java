package com.lgc.ctps.pocoweb.transfer.config.jdbc;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Component
@PropertySource("classpath:datasource.properties")
@EnableTransactionManagement
public class DsdsDataSourceConfiguration {
	@Bean
	@Primary
	@ConfigurationProperties("dsds.datasource")
	public DataSourceProperties dsdsDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	@Primary
	@ConfigurationProperties("dsds.datasource")
	public DataSource dsdsDataSource() {
		return dsdsDataSourceProperties().initializeDataSourceBuilder().build();
	}

	@Bean("dsdsTransactionManager")
	@Primary
	public DataSourceTransactionManager transactionManagerDSDS() {
		return new DataSourceTransactionManager(dsdsDataSource());
	}
}
