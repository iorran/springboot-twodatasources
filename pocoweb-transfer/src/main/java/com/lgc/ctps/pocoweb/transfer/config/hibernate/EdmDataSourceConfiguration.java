package com.lgc.ctps.pocoweb.transfer.config.hibernate;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@Component
@PropertySource("classpath:datasource.properties")
public class EdmDataSourceConfiguration {
	@Bean
	@ConfigurationProperties("edm.datasource")
	public DataSourceProperties edmDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	@ConfigurationProperties("edm.datasource")
	public DataSource edmDataSource() {
		return edmDataSourceProperties().initializeDataSourceBuilder().build();
	}
}
