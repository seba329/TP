import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class NumberTest {

private Number li;
	
	@Before
	public void setUp() throws Exception {
		li = new Number(16);
	}
	
	@Test
	public void testInit() throws Exception {
		assertNotNull(li);
	}
	
	@Test
	public void testSetCorrectValue() throws Exception {
		li.set(10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetWrongValue() {
		li.set(-10);
	}
	
	@Test
	public void testGetCorrectRadix() throws Exception {
		assertEquals(li.get(), 16);
		assertEquals(li.get(10), "16");
		assertEquals(li.get(16), "10");
		assertEquals(li.get(2), "10000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetWrongRadix() {
			li.get(-10);
			li.get(1);
			li.get(17);
	}
	
	@Test(timeout = 10) 	
	public void testEquals() throws Exception {
		assertNotNull(li);
		assertTrue(li.equals(li));
		assertFalse(li.equals(0));
	}
	
	@Ignore
	public void Something()
	{
		assertEquals(5,6);
	}
	
	@After
	public void tearDown() throws Exception {
		li = null;
	}

}
