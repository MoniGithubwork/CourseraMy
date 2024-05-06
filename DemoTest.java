/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */

package _d98c8a8f40b2003f1ac87e71d3e984f9_IntroToUnitTesting.zip_expanded;

	import static org.testng.Assert.assertTrue;
  import static org.junit.Assert.*;
	import java.io.ByteArrayInputStream;
	import java.io.ByteArrayOutputStream;
	import java.io.PrintStream;
	import javax.print.DocFlavor.INPUT_STREAM;
	import org.testng.annotations.Test;

		public class DemoTest extends Democlass{
		
		@Test
		public void test_is_triangle_1() {
			assertTrue(Democlass.isTriangle(3,4,5));
			
		}
		@Test
		public void test_is_triangle_2() {
			assertTrue(Democlass.isTriangle(5,12,13));
			
		}
		
		@Test
		public void test_is_triangle_3() {
			assertTrue(Democlass.isTriangle(5,13,12));
			
		}
		
		@Test
		public void test_is_triangle_4() {
			assertTrue(Democlass.isTriangle(12,5,13));
			
		}
		
		@Test
		public void test_is_NOTtriangle_1() {
			assertFalse(Democlass.isTriangle(13,7,5));
			
		}
		
		@Test
		public void test_is_NOTtriangle_2() {
			assertFalse(Democlass.isTriangle(5,9,3)); // Checked for positive value inputs if fullfilling the a+b>c
			
		}
		
		@Test
		public void test_is_NOTtriangle_3() {
			assertFalse(Democlass.isTriangle(1,2,-1)); // Checked for Negative value input
			
		}
		
		@Test
		public void test_is_NOTtriangle_4() {
			assertFalse(Democlass.isTriangle(13,0,5));// Checked for Zero input
			
		}
		
		@Test
		public void test_is_NOTtriangle_5() {
			assertFalse(Democlass.isTriangle(0,0,0)); // checked for all values as Zero input
			
		}
		
		@Test
		public void test_is_NOTtriangle_6() {
			assertFalse(Democlass.isTriangle(3.5,7.0,15.0)); // Not a triangle for decimal addition values id checked
			
		}
		
	}




