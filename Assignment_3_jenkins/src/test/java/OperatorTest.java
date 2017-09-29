import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorTest {
	
	Operator obj;
	int a,b;

	@Before
	public void setUp() throws Exception {
		
		obj= new Operator();
		a=8;
		b=3;
	}

	@After
	public void tearDown() throws Exception {
		
		obj=null;
		a=0;
		b=0;
			
	}

	@Test
	public void testSubtract() {
		
		assertEquals(5, obj.subtract(a, b));
		
		
		
	}
	@Test
	public void testMulitiply() {
		
		assertEquals(24, obj.multiply(a, b));
		
		
	}
}
