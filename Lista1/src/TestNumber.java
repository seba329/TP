import junit.framework.TestCase;
public class TestNumber extends TestCase {
   //próba 3
	private Number li;
	
	public TestNumber() {
		super();
	}

	public TestNumber(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		li = new Number(16);
	}

		
	public void testSetCorrectValue() throws Exception {
		li.set(10);
	}
	
	public void testSetWrongValue() throws Exception {
		try {
			li.set(-10);
			fail("this should fail");
		} catch (IllegalArgumentException ex) {
			
		}
	}
	
	public void testGetCorrectRadix() throws Exception {
		assertEquals(li.get(), 16);
		assertEquals(li.get(10), "16");
		assertEquals(li.get(16), "10");
		assertEquals(li.get(2), "10000");
	}
	
	public void testGetWrongRadix() throws Exception {
		try {
			li.get(-10);
			fail("this should fail");
		} catch (IllegalArgumentException ex) {
			
		}
		
		try {
			li.get(1);
			fail("this should fail");
		} catch (IllegalArgumentException ex) {
			
		}
		
		try {
			li.get(17);
			fail("this should fail");
		} catch (IllegalArgumentException ex) {
			
		}
	}
	
	public void testEquals() {
		assertNotNull(li);
		assertTrue(li.equals(li));
		assertFalse(li.equals(0));
	}
	
	protected void tearDown() throws Exception {
		li = null;
	}
}



