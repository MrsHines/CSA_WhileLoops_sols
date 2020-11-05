

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestDivisors
{
  public static void main(String args[]) {
    TestDivisors test = new TestDivisors();
    test.testempty();
    test.test6();
    test.test12();
    test.test1245();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestDivisors()
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
    public void testempty() {
        assertEquals("", Main.digitCounter(3));
    }

    @Test
    public void test6(){
      assertEquals("2 3", Main.digitCounter(6));
    }

    @Test
    public void test12(){
      assertEquals("2 3 4 6", Main.digitCounter(12));
    }
    
        @Test
    public void test1245(){
      assertEquals("3 5 15 83 249 415", Main.digitCounter(1245));
    }
}
