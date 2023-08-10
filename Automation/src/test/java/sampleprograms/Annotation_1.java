package sampleprograms;

import org.testng.annotations.Test;

public class Annotation_1 {
	@Test(invocationCount=2)
	public static void login() {
		int arr[]= {1,2,3};
		System.out.println(arr[5]);
		System.out.println("Upi Payment section");
	}
    @Test(dependsOnMethods="login")
	public static void homePage() {
		System.out.println("Card Payment section");
	}
    @Test
	public static void internet() {
		System.out.println("Internet Banking Payment section");
	}
}
