package test2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Keyword {
	@Test(invocationCount=100000)
	public void print_TC1()
	{
		Reporter.log("--running TC1--",true);
	}

}
