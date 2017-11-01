package com.cmig.magtask;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cmig.magtask")
@MapperScan("com.cmig.magtask.dao")
@SpringBootApplication
public class MagTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagTaskApplication.class, args);
	}
}
