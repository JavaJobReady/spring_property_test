package com.hostmdy.property;
import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hostmdy.property.bean.CloudDataSource;
import com.hostmdy.property.bean.Employee;
import com.hostmdy.property.bean.LombokTest;
import com.hostmdy.property.bean.MyDataSource;

@SpringBootApplication
public class SpringPropertyTestApplication implements CommandLineRunner{
	
	@Autowired
	LombokTest lombokTest;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringPropertyTestApplication.class, args);
		
		MyDataSource datasourceBean = context.getBean(MyDataSource.class);
		System.out.println("Username : "+datasourceBean.getUsername());
		System.out.println("Password : "+datasourceBean.getPassword());
		System.out.println("URL : "+datasourceBean.getUrl());
		
		CloudDataSource cloudDatasourceBean = context.getBean(CloudDataSource.class);
		System.out.println("Service : "+cloudDatasourceBean.getService());
		System.out.println("Authen : "+cloudDatasourceBean.getAuthentication());
		System.out.println("Cached : "+cloudDatasourceBean.getCached());
		
		Employee employeeBean = context.getBean(Employee.class);
		System.out.println("FirstName : "+employeeBean.getFirstname());
		System.out.println("LastName : "+employeeBean.getLastname());
		System.out.println("Email : "+employeeBean.getEmail());
		System.out.println("Active : "+employeeBean.isActive());
		System.out.println("Fields : "+employeeBean.getFields());
//		List<String> fields = Arrays.asList(employeeBean.getFields());
//		fields.forEach(System.out::println);
		
//		for(String temp:employeeBean.getFields())
//			System.out.println(temp);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(lombokTest);
		LombokTest testObj = new LombokTest(1001,"JawJaw","12/blabla");
		
		System.out.println("Same Obj?"+lombokTest.equals(testObj));
		
		
	}

}
