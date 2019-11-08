package com.yalongz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan("com.yalongz.component.mapper")
public class MultipleDataApplications {
	public static void main(String[] args) {
		SpringApplication.run(MultipleDataApplications.class, args);
	}
}
