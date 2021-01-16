import static org.junit.Assert.*;

import org.junit.Test;

public class ctest {
    @Test
    public void test2()
    {
        Commi c=new Commi();
        int expected=0;
        int actual=c.commis(0, 0, 0);
        assertEquals(expected,actual);
    }
    @Test
    public void test1()
    {
        Commi c=new Commi();
        float expected=(float) 28.1;
        float actual=c.commis(10, 10, 9);
        assertEquals(expected,actual,2);
    }
}
