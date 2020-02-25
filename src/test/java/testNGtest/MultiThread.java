package testNGtest;

import org.testng.annotations.Test;

public class MultiThread extends Thread{

	public void run() {
		System.out.println("Hello");
	}

	@Test
	public void func() throws Exception {
		MultiThread obj = new MultiThread();
		obj.start();
		Thread.sleep(1000);
		System.out.println("Sleep Thread called...");
	}
}
