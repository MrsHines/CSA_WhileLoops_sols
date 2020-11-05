import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestAvg
{
  public static void main(String args[]) {
    TestAvg test = new TestAvg();
    test.test3digits();
    test.test4digits();
    test.test1digit();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestAvg()
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
        assertEquals(100.0, Main.digitAvg(300));
    }
    
    @Test
    public void test4digits(){
      assertEquals(2.5, Main.digitAvg(1234));
    }

    @Test
    public void test1digit(){
      assertEquals(3.0, Main.digitAvg(3));
    }
    
    
}
