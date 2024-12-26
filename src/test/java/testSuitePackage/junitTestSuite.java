package testSuitePackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import basePackage.baseClass;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import testLayer.loginTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	loginTest.class
})
public class junitTestSuite extends baseClass {
	 public static void main(String[] a) {
	      // add the test's in the suite
	      TestSuite suite = new TestSuite(loginTest.class );
	      TestResult result = new TestResult();
	      suite.run(result);
	      System.out.println("Number of test cases = " + result.runCount());
	   }

}
