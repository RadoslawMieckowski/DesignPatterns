package Patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Tax19 implements Tax{
    @Override
    public BigDecimal addTax(BigDecimal value) {
        return value.multiply(BigDecimal.valueOf(0.19));
    }
}
