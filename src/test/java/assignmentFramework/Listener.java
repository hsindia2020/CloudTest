package assignmentFramework;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter{

//	These methods are used in XML.
	
	public void onTestSuccess(ITestResult tr) {
		
		System.out.println("Test Success !!!");
		
	}
	
public void onTestFailure(ITestResult tr) {
		
		System.out.println("Test Failure !!!");
		
	}
}
