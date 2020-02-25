package com.pcs.retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test(retryAnalyzer = com.pcs.retryAnalyzer.retryAnalyzerDemo.class)
  public void RetryTC1() {
	  
	  Assert.assertEquals(false, true);
  }
  
  @Test
  public void RetryTC2() {
	  Assert.assertEquals(false, true);
  }
  
  @Test
  public void RetryTC3() {
	  Assert.assertEquals(true, true);
  }
}
