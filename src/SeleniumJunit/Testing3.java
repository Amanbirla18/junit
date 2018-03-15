package SeleniumJunit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

//if assert fails scripts stops to over come this we can use try and catch method but failures are not reported now if we use 
//error collector then system continue the script and error are reported


public class Testing3 {

@Rule
public ErrorCollector ercol = new ErrorCollector();

	@Test
	public void test6() {
		System.out.println("I am before assert");
		String Expectederrormessage = "abc";
		String Actualerrormessage ="abc";
		Assert.assertEquals(Expectederrormessage, Actualerrormessage);
		System.out.println("I am after assert");
		try { 
			Assert.assertTrue(2>3);
		} catch(Throwable t) {
			System.out.println("I am in catch of test 6");
			ercol.addError(t);
			
		}
		System.out.println("I am 2nd assert of test 6");
	}
	
	@Test
	public void test7() {
		System.out.println("I am before assert");
		String Expectederrormessage = "abc";
		String Actualerrormessage ="xyz";
		try {
		Assert.assertEquals(Expectederrormessage, Actualerrormessage);
		}
		catch(Throwable t){
			System.out.println("I am in catch of test 7");
			ercol.addError(t);
		}
		System.out.println("I am after assert");
		Assert.assertTrue(2<3);
		System.out.println("I am 2nd assert of test 7 ");
	}

}
