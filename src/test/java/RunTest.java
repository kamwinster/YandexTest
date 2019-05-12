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
        Run Myclass = new Run();
        String expected = Myclass.getSTR("qwerty");
        assertEquals(stroka,expected);
    }

    @Test
    public void test3(){
        int a = 3;
        Run Myclass = new Run();
        int b = Myclass.getNUM(5);
        assertEquals(a,b);
    }

    @After
    public void test4(){
        System.out.println("Завершаем тест");
    }
}
