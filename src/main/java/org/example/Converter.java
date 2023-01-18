package org.example;

import java.math.BigDecimal;

public class Converter {

    public void convertToDolar(BigDecimal value) {
        BigDecimal cotation = new BigDecimal("5.10");

        BigDecimal mount = value.divide(cotation).setScale(2);
        System.out.println(mount);
    }
}
