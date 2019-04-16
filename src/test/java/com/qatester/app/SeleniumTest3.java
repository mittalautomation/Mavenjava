package com.qatester.app;

import org.testng.annotations.Test;

public class SeleniumTest3 {

	@Test
	public void AdminHome()
	{
		System.out.println("check Admin home");
	}

@Test
public void userhome()
{
	System.out.println("check Userhome");
}
}
//run regrerssion test : mvn test -PRegression  Space should be keep in mind 
/* mvn clean
mvn compile
mvn test
mvn test -PSmoke

single test  mvn -Dtest=SeleniumTest2 test
*/