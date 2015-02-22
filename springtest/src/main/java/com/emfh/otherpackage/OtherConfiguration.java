package com.emfh.otherpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.emfh.model.MyTestObject;

@Configuration
public class OtherConfiguration {

	@Bean
	public MyTestObject myTestObject() {
		return new MyTestObject("other-name");
	}
}
