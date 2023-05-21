import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;

public class TestClass {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Inside before method");
    }

    @Test
    public void firstTest() {
        System.out.println("Inside first method");
        AddClass addClass = new AddClass();
        int res = addClass.getSum(2,3);
        Assert.assertEquals(5, res);
    }

    @Test
    public void secondTest() {
        System.out.println("This is second test");

        }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
        System.out.println();
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }
}