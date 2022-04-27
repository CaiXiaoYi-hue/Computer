import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void shoulereturn2whenoneplusone() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int cacuresult = calculator.compute(1,1,"Add");
        int expectresult = 2;
        Assert.assertEquals(expectresult,cacuresult);
    }

    @Test
    public void shoulereturn2whenonesubone() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int cacuresult = calculator.compute(1,1,"Sub");
        int expectresult = 0;
        Assert.assertEquals(expectresult,cacuresult);
    }

}