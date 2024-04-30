import org.example.FactorialCalc;
import org.example.MyNegativeValueException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalcTest {
    private FactorialCalc factorialCalc;

    @BeforeEach
   public void init() {
        factorialCalc = new FactorialCalc();
    }

    @DisplayName("Проверка расчета факториала положительного числа")
    @Test
    public void positiveCalc() {
        int value = 3;
        assertEquals(6, factorialCalc.getFactorial(value));
    }

    @DisplayName("Проверка расчета нулевого факториала")
    @Test
    public void positiveCalcWithZeroValue() {
        int value = 0;
        assertEquals(1, factorialCalc.getFactorial(value));
    }

    @DisplayName("Проверка расчета факториала отрицательного числа")
    @Test
    public void negativeValueCalc() {
        int value = -10;
        MyNegativeValueException myNegativeValueException = assertThrows(MyNegativeValueException.class, () ->
        { factorialCalc.getFactorial(value);
        });

        String expectedMessage = "Невозможно рассчитать факториал отрицательного числа";
        String actualMessage = myNegativeValueException.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));

    }
}
