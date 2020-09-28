package com.pcs.failedTestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

@Listeners(CustomerListener.class)
public class ScreenshotTest extends BaseClassTC {
  @Test
  public void Test01() {
	  Assert.assertEquals(false, true);
  }
  @BeforeMethod
  public void beforeM() {
	  func();
  }

  @AfterMethod
  public void afterM() {
//	  driver.close();
//	  driver.quit();
  }

}
