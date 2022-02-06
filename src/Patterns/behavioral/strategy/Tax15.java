package Patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Tax15 implements Tax{
    @Override
    public BigDecimal addTax(BigDecimal value) {
        return value.multiply(BigDecimal.valueOf(0.15));
    }
}
