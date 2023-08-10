package sampleprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClassSample {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class drivers open");
	}
	@BeforeMethod
	
	public static void beforMethod() {
		System.out.println("Before method login the application");
	}
	@Test
	
	public static void testScript() {
		System.out.println("Test scripts steps");
	}
	@AfterMethod
	public static void afterMethod() {
		System.out.println("After method logout the application");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After class close the driver");
	}

}
