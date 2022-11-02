package com.hostmdy.property.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
//@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class LombokTest {
	
	private final int id;
	private final String name;
	private int age;
	
	@NonNull
	private String nrc;

}
