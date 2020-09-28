package testNGtest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestDependency {
  @Test(dependsOnMethods = "T02", groups = "Sanity")
  public void T01() {
	  System.out.println("Test T01");
  } 
  
  @Test(groups = "Regression")
  public void T02() {
	  assertEquals(true, false);
	  System.out.println("Test T02");
  }
  
  @Test(groups = "Regression")
  public void T03() {
	  assertEquals(true, false);
	  System.out.println("Test T03");
  }
  
  @Test(groups = "UAT")
  public void T04() {
	  assertEquals(true, false);
	  System.out.println("Test T04");
  }
  
}
