package CalcPackage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculaterTesting {
	ModelClass obj=new ModelClass();
	public CalculaterTesting() {obj=new ModelClass();}
	
	@Test
	public void AddTesting() {
		obj.setFN(5);
		obj.setSN(6);
		double actual=obj.Cal("add");
		assertEquals(actual,11,0.01);	
	}
	@Test 
	public void SubtractTesting() {
		obj.setFN(8);
		obj.setSN(2);
		double actual=obj.Cal("subtract");
		assertEquals(actual,6,0.01);	
	}
	@Test 
	public void MultiplyTesting() {
		obj.setFN(8);
		obj.setSN(5);
		double actual=obj.Cal("multiply");
		assertEquals(actual,40,0.01);	
	}
	@Test 
	public void DivideTesting() {
		obj.setFN(8);
		obj.setSN(2);
		double actual=obj.Cal("divide");
		assertEquals(actual,4,0.01);
	}
	@Test
	public void ModTesting() {
		obj.setFN(9);
		obj.setSN(2);
		double actual=obj.Cal("mod");
		assertEquals(actual,1,0.01);
	}
	@Test
	public void SqrtTesting() {
		obj.setFN(25);
		double actual=obj.Cal("sqrt");
		assertEquals(actual,5,0.01);
	}
	@Test(expected=NumberFormatException.class) 
	public void TypeCheckingTesting() {
		obj.setFN(Double.parseDouble("hello"));
		obj.setSN(Double.parseDouble("hi"));
		
	}
	@Test(expected=IllegalArgumentException.class) 
	public void DivideByZeroTesting() {
		obj.setFN(5);
		obj.setSN(0);
		obj.Cal("divide");
	}
	@Test(expected=ArithmeticException.class)
	public void negativeSqrt() {
		obj.setFN(-9);
		obj.Cal("sqrt");
	}
	@Test(expected=NumberFormatException.class)
	public void PressOperaterFirst() {
		obj.setFN(Double.parseDouble(""));
		obj.Cal("add");
	}
	

}
