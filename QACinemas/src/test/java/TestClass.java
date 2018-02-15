import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    @Test
    public void AddTest(){
        Calculator calculator = new Calculator();
        int answer = calculator.Add(1,1);
        Assert.assertEquals("Is the answer correct",2,answer);
    }

    @Test
    public void SubTest(){
        Calculator calculator = new Calculator();
        int answer = calculator.Sub(1,1);
        Assert.assertEquals("Is the answer correct",0,answer);
    }


}

