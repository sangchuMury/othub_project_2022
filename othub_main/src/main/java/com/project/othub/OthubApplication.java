package com.project.othub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import member.MemberDAO;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackages = "controller")
@ComponentScan(basePackages = "member")

@MapperScan(basePackageClasses = MemberDAO.class)
public class OthubApplication {

	public static void main(String[] args) {
		SpringApplication.run(OthubApplication.class, args);
	}

}
