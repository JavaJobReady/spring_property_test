package com.hostmdy.property.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

//@Getter
//@Setter
//@AllArgsConstructor
//@EnableConfigurationProperties
//@ConfigurationProperties/*(prefix = "oracle")*/
@Value
public class MyDataSource {//Immutable Object DTO
	
	private String username;
	private String password;
	private String url;

}
