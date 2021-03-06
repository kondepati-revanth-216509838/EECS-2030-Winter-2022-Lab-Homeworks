

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;





@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lab2Tester {

	
	// sum
	
	@Test
	public void testSum1() {
		int start = 0;
		int end = 5; 
		int  sum= 0;
		for (int i = start ; i <= end ; i++) 
			sum  += i;
		
		assertEquals("Failed at sum (" + start + ", " + end + ")", sum, Lab2.sum(start, end));
			
	}
	

	@Test
	public void testMakeString1() {
		char init = '*'; 
		int n = 5;
		String result = ""; 
		for (int i = 0 ; i < n ; i++)
			result += init;
		assertEquals("Failed at makeString(" + init + ", " + n + ")", result, Lab2.makeString(init, n));	
	}

	
	@Test
	public void testInterlace1() {

		String str = "*";
		assertEquals("Failed: interlace(\"*\",\"-\",1)", str, Lab2.interlace("*","-",1));
	}

	@Test
	public void testInterlace2() {

		String str = "HelloWorld";
		assertEquals("Failed: interlace(\"Hello\",\"World\",2)", str, Lab2.interlace("Hello","World",2));
	}
	
	@Test
	public void testInterlace3() {

		
		String str = "";
		for (int i = 0; i < 50; i++) {
			str+= "HelloWorld";
		}
		assertEquals("Failed: interlace(\"Hello\",\"World\",100)", str, Lab2.interlace("Hello","World",100));
	}
	
	@Test
	public void testInterlace4() {

		String str = "*-*-*-*-*-*";
		assertEquals("Failed: interlace(\"*\",\"-\",11)", str, Lab2.interlace("*","-",11));
	}
	

	@Test
	public void testGetSubstring1() {

		String str1 = "x + y + z - ( y * z) / 3 * n ";
		String result = " y * z";
		char open = '(';
		char close = ')';
		assertEquals("Failed: getSubstring(\"x + y + z - ( y * z) / 3 * n \", \"(\", \")\")", result, Lab2.getSubstring("x + y + z - ( y * z) / 3 * n ", '(', ')'));
	}

	@Test
	public void testDecimalToBinary1() {
		int decimal = 23; 
		String binary = "10111";
		assertEquals("Failed: decimalToBinary(23)", binary, Lab2.decimalToBinary(23));
	}
	
	@Test
	public void testDecimalToBinary2() {
		int decimal = 0; 
		String binary = "0";
		assertEquals("Failed: decimalToBinary(0)", binary, Lab2.decimalToBinary(0));
	}

}