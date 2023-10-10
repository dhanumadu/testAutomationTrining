import org.testng.annotations.Test;

public class TestCalss {

    @Test(priority = 1)
    void setup(){
        System.out.println("I am inside setup");
    }

    @Test(priority = 2)
    void testSteps(){
        System.out.println("I am inside test steps");
    }

    @Test(priority = 3)
    void tearDown(){
        System.out.println("I am inside tear down");
    }
}
