package com.shuttle.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages = "com.shuttle.model.dao")	// mybatis가 참조할 dao 경로를 잡아줌
public class DataAccessConfig {
	// 해당 클래스는 com.shuttle.model.dto 패키지안에 있는 특정 dto를 mapper와 연결해주는 클래스 입니다.

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		// dataSourceConfig에서 만들어진 dataSource객체를 가지고 mapper를 작동시킴

		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		// 객체 생성

		sessionFactory.setDataSource(dataSource);
		sessionFactory.setMapperLocations(
				new PathMatchingResourcePatternResolver().
				getResources("classpath:static/mapper/*.xml"));
				// classpath는 src/main/resources를 줄인 것.
				// mapper폴더 안에 우리가 만들 mapper.xml들이 들어감
				
		return sessionFactory.getObject();
	}

	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		// sqlSessionTemplate 설정
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
