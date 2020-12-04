package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test(enabled=false)
	public void browserAutomation() {
		System.out.println("This is browser automation test");
		//Added by GitDemo user
		System.out.println("PostJira");
		
		//GitX user added below
		System.out.println("PostJira 2");
		System.out.println("PostJira 3");
	}
	
	@Test(groups={"Smoke"})
	public void elementTest() {
		System.out.println("This is Element test");
	}
}
