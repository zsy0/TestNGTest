package testEx;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import code.SimpleOp;

public class SimpleOpTest {

	@BeforeMethod
	public SimpleOp doFirst() {
		return new SimpleOp();
	}

	@Test
	public void testAdd() {
		SimpleOp so = doFirst();
		int result = so.add(1, 3);
		Assert.assertEquals(result, 4);
	}

	@Test
	public void testSub() {
		SimpleOp so = doFirst();
		int result = so.sub(3, 1);
		Assert.assertEquals(result, 2);
	}
}
