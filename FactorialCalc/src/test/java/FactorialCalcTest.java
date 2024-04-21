import org.example.FactorialCalc;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FactorialCalcTest {
    private FactorialCalc factorialCalc;


    @BeforeTest
    public void beforeTest() {
        factorialCalc = new FactorialCalc();
    }


    @Test(testName="Проверка расчета факториала положительного числа")
    public void positiveCalc() {
        int value = 3;
        Assert.assertEquals(6, factorialCalc.getFactorial(value));
    }

    @Test(testName="Проверка расчета нулевого факториала")
    public void positiveCalcWithZeroValue() {
        int value = 0;
        Assert.assertEquals(1, factorialCalc.getFactorial(value));
    }

    @Test(testName="Проверка расчета факториала отрицательного числа")
    public void negativeValueCalc() {
        int value = -50;
        Assert.assertEquals(0, factorialCalc.getFactorial(value));
    }

}
