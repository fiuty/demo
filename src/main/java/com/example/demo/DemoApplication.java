package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication注解相当于以下三个注解的功能集成:
 * @EnableAutoConfiguration:启用SpringBoot的自动bean加载机制,平常自定义配置@Configuration类生效
 * @ComponentScan:在应用程序所在包上启用扫描
 * @Configuration:允许在Spring中注册额外的bean或导入其他配置类
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
