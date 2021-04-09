package com.TestNgexample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
	@Test
	@Parameters("myName")
public void parameter(String myName) {
		System.out.println("name is :"+myName);
	}
}
