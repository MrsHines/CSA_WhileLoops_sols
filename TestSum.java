

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestSum
{
  public static void main(String args[]) {
    TestSum test = new TestSum();
    test.test3digits();
    test.test4digits();
    test.test1digit();
    test.test5digits();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestSum()
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
        assertEquals(1, Main.digitSum(100));
    }
    
    @Test
    public void test4digits(){
      assertEquals(10, Main.digitSum(1234));
    }

    @Test
    public void test1digit(){
      assertEquals(3, Main.digitSum(3));
    }
    
    @Test
    public void test5digits(){
      assertEquals(15, Main.digitSum(12345));
    }
    
}
