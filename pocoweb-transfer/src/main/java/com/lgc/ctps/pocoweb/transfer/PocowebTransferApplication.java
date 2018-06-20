package com.lgc.ctps.pocoweb.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.web.client.RestTemplate;

@EntityScan(basePackageClasses = { PocowebTransferApplication.class, Jsr310JpaConverters.class })
@SpringBootApplication(exclude = {JndiConnectionFactoryAutoConfiguration.class,DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,JpaRepositoriesAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class})
public class PocowebTransferApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PocowebTransferApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PocowebTransferApplication.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/**
	 * Excluimos o bean dataSource do MBeanExporter, pois, ao subir mais de uma
	 * aplicação no mesmo container dava erro.
	 *
	 * Foi necessário adicionar a seguimte linha no application.properties:
	 * "spring.datasource.hikari.registerMbeans=true"
	 *
	 * @return MBeanExporter without dataSource
	 */
//	@Bean
//	public MBeanExporter exporter() {
//		final MBeanExporter exporter = new MBeanExporter();
//		exporter.setAutodetect(true);
//		exporter.setExcludedBeans("dataSource");
//		return exporter;
//	}
}
