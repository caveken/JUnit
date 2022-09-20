package practise;

import org.junit.*;

public class C02_Junit {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }
    @Before
    public void before(){
        System.out.println("before");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }
    @After
    public void after(){
        System.out.println("after");
    }
    @Test
    public void test01(){
        System.out.println("test01");
    }
    @Test
    public void test02(){
        System.out.println("test02");
    }
    @Test
    public void test03(){
        System.out.println("test03");
    }

}
