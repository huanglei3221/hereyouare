package com.snake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import javax.swing.*;
import java.util.Locale;


// SpringBootApplication  来标注一个主程序类。说明这个是一个SpringBoot应用
@SpringBootApplication()
@EnableScheduling   //开启定时任务注解
@ImportResource(locations = {"classpath:Person5.xml"})
public class HereYouAreApplication {
	public static void main(String[] args) {
		SpringApplication.run(HereYouAreApplication.class, args);
	}


	@Bean
	public ViewResolver MyViewResolver(){
		return new MyViewResolver();
	}

	private  static class MyViewResolver implements ViewResolver{
		@Override
		public View resolveViewName(String s, Locale locale) throws Exception {
			return null;
		}
	}
}



