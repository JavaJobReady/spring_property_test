package com.hostmdy.property.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@EnableConfigurationProperties
//@ConfigurationProperties/*(prefix = "aws.cloud")*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CloudDataSource {
	
	private String service;
	private String authentication;
	private String cached;

}
