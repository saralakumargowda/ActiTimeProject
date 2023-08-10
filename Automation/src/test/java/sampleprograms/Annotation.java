package sampleprograms;

import org.testng.annotations.Test;
@Test
public class Annotation {
	@Test(priority=2)
	public static void upi() {
		System.out.println("Upi Payment section");
	}
	@Test(enabled=true)
	public static void card() {
		System.out.println("Card Payment section");
	}
	@Test(invocationCount=3)
	public static void internet() {
		System.out.println("Internet Banking Payment section");
	}

}
