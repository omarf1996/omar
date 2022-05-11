package testng;

import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestexcution {
  @Test//5 before will execute before test ann the afterclasses after test 
  public void f() {
	  System.out.println("this is test annotation");
  }
  @BeforeMethod//4
  public void beforeMethod() {
	  System.out.println("this is before method annotation");
  }

  @AfterMethod//6
  public void afterMethod() {
	  System.out.println("this is after method annotation");
  }
  @Test
  public void test2() {
	  System.out.println("this is test2");
  }
  
  @BeforeClass//3
  public void beforeClass() {
	  System.out.println("this is before class"); //we want to know which method will run first
  }

  @AfterClass//7
  public void afterClass() {
	  System.out.println("this is after class");
  }

  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("this is before test");
  }

  @AfterTest//8
  public void afterTest() {
	  System.out.println("this is after test annotation");
  }

  @BeforeSuite//1
  public void beforeSuite() {
	  System.out.println("this is beforesuite annotation");
  }

  @AfterSuite//9
  public void afterSuite() {
	  System.out.println("this is aftersuite annotation");
  }

}
