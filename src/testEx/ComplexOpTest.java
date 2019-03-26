package testEx;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import code.ComplexOp;

public class ComplexOpTest {

	@BeforeMethod
	public ComplexOp beforeTest() {
		return new ComplexOp();
	}

	@Test
	public void testMultiply() {
		ComplexOp so = beforeTest();
		double result = so.multiply(3, 4);
		Assert.assertEquals(result, 12.0);
	}

	@Test
	public void testDevide() {
		ComplexOp so = beforeTest();
		double result = so.divide(12, 6);
		Assert.assertEquals(result, 2.0);
	}

}
