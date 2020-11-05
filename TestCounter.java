

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCounter
{
  public static void main(String args[]) {
    TestCounter test = new TestCounter();
    test.test3digits();
    test.test4digits();
    test.test1digit();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestCounter()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void test3digits() {
        assertEquals(3, Main.digitCounter(100));
    }
    
    @Test
    public void test4digits(){
      assertEquals(4, Main.digitCounter(1234));
    }

    @Test
    public void test1digit(){
      assertEquals(1, Main.digitCounter(3));
    }
    
    
}
