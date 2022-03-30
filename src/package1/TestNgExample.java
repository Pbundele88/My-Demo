package package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class TestNgExample {
	
@Test
	public void m1(){
	System.out.println("I am in m1");
}

@Test
	public void m11(){
	System.out.println("I am in 2nd Test");
	
}
@BeforeTest
public void m2(){
	System.out.println("I am in beforetest");
}
@AfterTest 
public void m3(){
	System.out.println("I am in aftertest");
}
@BeforeClass
public void m4(){
	System.out.println("I am in beforeclass");
}
@AfterClass
public void m5(){
	System.out.println("I am in afterclass");
}
@BeforeMethod
public void m6(){
	System.out.println("I am in beforemethod");
}
@AfterMethod
public void m7(){
	System.out.println("I am in aftermethod");
}
}
