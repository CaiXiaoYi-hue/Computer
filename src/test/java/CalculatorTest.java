import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void shoulereturn2whenoneplusone(){
        Calculator calculator = new Calculator();
        int cacuresult = calculator.compute(1,1,'+');
        int expectresult = 2;
        Assert.assertEquals(expectresult,cacuresult);
    }

    @Test
    public void shoulereturn2whenonesubone(){
        Calculator calculator = new Calculator();
        int cacuresult = calculator.compute(1,1,'+');
        int expectresult = 2;
        Assert.assertEquals(expectresult,cacuresult);
    }

}