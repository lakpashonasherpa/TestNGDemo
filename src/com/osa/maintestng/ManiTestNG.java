package com.osa.maintestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManiTestNG {
	@BeforeTest
	public void test2() {
	System.out.println("I am from before test");
	}
	@AfterTest
	public void test3() {
	System.out.println("I am from after test");
	}
	@BeforeClass
	public static void test4() {
	
	System.out.println("I am running before class");
	}
	@AfterClass
	public static void test5() {
	System.out.println("I am running after class");
	
	}
}
