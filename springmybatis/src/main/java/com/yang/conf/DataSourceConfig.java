package com.yang.conf;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.yang")
@MapperScan("com.yang.dao.mapper")
public class DataSourceConfig {

    // @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setPassword("ssss1111");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/yy-test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        //使用注解 这个不用了
       /* Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:/mappers/*.xml");
        factoryBean.setMapperLocations(resources);*/
        //设置使用Log4j日志
        /*org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLogImpl(Log4jImpl.class);
        factoryBean.setConfiguration(configuration);*/
        return factoryBean;
    }
}
