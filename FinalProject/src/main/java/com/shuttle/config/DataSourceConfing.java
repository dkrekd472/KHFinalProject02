package com.shuttle.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfing {
	// 해당 클래스는 classpath에 있는 application.properties에 있는 정보를 갖고와서
	// db와 연결해줄 dataSource객체를 만드는 클래스
	
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

}
