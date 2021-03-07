package SecondActivity;


import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest extends Calculator {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(15, calculator.add(9,6));
        Assert.assertEquals(6, calculator.add(-3,9));
    }

    @Test
    public void subtract() {
        Assert.assertEquals(4, calculator.sub(6,2));
        Assert.assertEquals(3, calculator.sub(-4,-7));
    }

    @Test
    public void multi() {
        Assertions.assertEquals(9, calculator.multi(3,3));
        Assertions.assertEquals(-4, calculator.multi(4,-1));
    }

    @Test
    public void divide() {
        Assertions.assertEquals(4.00, calculator.div(16,4));
        Assertions.assertEquals(0.00, calculator.div(16,0));
    }
}

