package TestRunners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import testLayer.loginTest;

public class testRunner {
	 public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(loginTest.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }

}
