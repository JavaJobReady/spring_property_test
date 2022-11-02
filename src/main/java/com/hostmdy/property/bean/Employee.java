package com.hostmdy.property.bean;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Component
@EnableConfigurationProperties
@ConfigurationProperties
@Getter
@Setter
@PropertySource("classpath:employee.yml")
public class Employee {
	
	private String firstname;
	private String lastname;
	private String email;
	private boolean active;
	List<String> fields;

}
