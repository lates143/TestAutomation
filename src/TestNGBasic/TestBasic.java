package TestNGBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestBasic {
	@Test
	public void TC1() {
		Reporter.log("Hello",true);
	}
	@Test
	public void TC2() {
		Reporter.log("hii", true);
	}
	
}
