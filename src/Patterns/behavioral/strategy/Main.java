package Patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product product=new Product(BigDecimal.valueOf(100));
        Tax tax15=new Tax15();
        System.out.println(product.grosPrice(tax15));
    }
}
