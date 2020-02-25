package com.pcs.retryAnalyzer;

import java.lang.reflect.Constructor;

import org.aopalliance.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TransforTestcase implements IAnnotationTransformer{
  
//	public void transform(ITestAnnotation annotation, Class testclass, Constructor testConstructor, Method testMethod){
//		
//		annotation.setRetryAnalyzer(retryAnalyzerDemo.class);
//		
//	}
//
//	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor,
			java.lang.reflect.Method testMethod) {
		annotation.setRetryAnalyzer(retryAnalyzerDemo.class);
		
	}
}
