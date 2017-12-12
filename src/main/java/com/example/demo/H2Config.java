package com.example.demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class H2Config {
	
	@Bean
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean(DataSource dataSource, HibernateJpaVendorAdapter hibernateJpaVendorAdapter) {
		LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
		lcemfb.setJpaVendorAdapter(hibernateJpaVendorAdapter);
		lcemfb.setDataSource(dataSource);
		lcemfb.setPackagesToScan("com.example.demo.entity");
		return lcemfb;
	}
	
	
	
	@Bean
	public HibernateJpaVendorAdapter getJpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabase(Database.H2);
		return adapter;
	}
    
	@Bean
	public DataSource getDataSource() {
	      return  new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
	    		  .build();
	}
}
