package Patterns.behavioral.strategy;

import java.math.BigDecimal;

public interface Tax {
    public BigDecimal addTax(BigDecimal value);
}
