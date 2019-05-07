import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RunTest {
    @Before
    public void test1(){
        System.out.println("Запускаем тест");
    }

    @Test
    public void test2(){
        String stroka = "qwerty";
        String expected = "qwerty";
        assertEquals("Passed",stroka,expected);
    }

    @Test
    public void test3(){
        int a = 5;
        int b = 5;
        assertEquals("Passed",a,b);
    }

    @After
    public void test4(){
        System.out.println("Завершаем тест");
    }
}
