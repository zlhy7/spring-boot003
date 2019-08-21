package com.renyong.springboot003;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
// 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@EnableTransactionManagement
//开启dao的扫描
@MapperScan(basePackages="com.renyong.**.dao",annotationClass=org.springframework.stereotype.Repository.class)
public class SpringBoot003Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot003Application.class, args);
	}

}
