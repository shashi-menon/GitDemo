package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test(enabled=false)
	public void browserAutomation() {
		System.out.println("This is browser automation test");
	}
	
	@Test(groups={"Smoke"})
	public void elementTest() {
		System.out.println("This is Element test");
	}
}
