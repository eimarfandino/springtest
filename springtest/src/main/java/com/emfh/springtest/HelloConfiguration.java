package com.emfh.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.emfh.model.MyTestObject;
import com.emfh.otherpackage.OtherConfiguration;

@Configuration
@Import({OtherConfiguration.class})
public class HelloConfiguration {

	@Bean
	public MyTestObject myTestObject() {
		return new MyTestObject("original-name");
	}
}
