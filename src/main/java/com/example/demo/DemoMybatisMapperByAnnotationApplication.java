package com.example.demo;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Category;
@MappedTypes(Category.class)
@MapperScan("com.example.mapper")
@SpringBootApplication
public class DemoMybatisMapperByAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMybatisMapperByAnnotationApplication.class, args);
	}

}
