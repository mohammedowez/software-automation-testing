import static org.junit.Assert.*;
import org.junit.Test;

public class triangletest
{
    @Test
    public void test1()
    {
        triangleClass c=new triangleClass();
        String expectedvalue="scalene";
        String actualvalue=c.triangle(3,4,5);
        assertEquals(expectedvalue,actualvalue);
    }
    @Test
    public void test2()
    {
        triangleClass c=new triangleClass();
        String expectedvalue="equilateral";
        String actualvalue=c.triangle(1,1,1);
        assertEquals(expectedvalue,actualvalue);

    }
    @Test
    public void test3()
    {

        triangleClass c=new triangleClass();
        String expectedvalue="isosceles";
        String actualvalue=c.triangle(5,5,1);
        assertEquals(expectedvalue,actualvalue);

    }
    @Test
    public void test4()
    {

        triangleClass c=new triangleClass();
        String expectedvalue="Not a triangle";
        String actualvalue=c.triangle(1,1,2);
        assertEquals(expectedvalue,actualvalue);
    }
}
