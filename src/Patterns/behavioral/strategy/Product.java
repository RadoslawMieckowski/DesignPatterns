package Patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Product {
    private BigDecimal netPrice;

    public Product(BigDecimal price){
        netPrice=price;
    }

    public BigDecimal grosPrice(Tax tax){
        return netPrice.add(tax.addTax(netPrice));
    }


}
