package com.course.businessnew;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
//eureka客户端
@EnableEurekaClient
//数据库配置
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//mapper包扫描
@ComponentScan("com.course")
@MapperScan("com.course.server.dao")
public class BusinessApplication {
	private static final Logger LOG= LoggerFactory.getLogger(BusinessApplication.class);

	public static void main(String [] args){
	    SpringApplication springApplication=new SpringApplication(BusinessApplication.class);
		Environment environment=springApplication.run(args).getEnvironment();
		LOG.info("启动成功");
		LOG.info("Business地址: \thttp://127.0.0.1:{}",environment.getProperty("server.port"));
	}
}
