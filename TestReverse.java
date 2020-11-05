

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestReverse
{
  public static void main(String args[]) {
    TestReverse test = new TestReverse();
    test.test3digits();
    test.test4digits();
    test.test1digit();
    test.testwithzeros();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestReverse()
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
        assertEquals(321, Main.reverse(123));
    }
    
    @Test
    public void test4digits(){
      assertEquals(4321, Main.reverse(1234));
    }

    @Test
    public void test1digit(){
      assertEquals(3, Main.reverse(3));
    }

    @Test
    public void testwithzeros(){
      assertEquals(3001, Main.reverse(1003));
    }
    
    
}
