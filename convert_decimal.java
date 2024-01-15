package lab;

import java.math.BigDecimal;
import java.math.MathContext;


public class convert_decimal {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("1");
        BigDecimal num2 = new BigDecimal("3");
        BigDecimal result = num1.divide(num2,MathContext.DECIMAL32);
        System.err.println("The result is : "+result);
    }
}
