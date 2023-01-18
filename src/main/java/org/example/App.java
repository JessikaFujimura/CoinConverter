package org.example;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Converter converter = new Converter();
        converter.convertToDolar(new BigDecimal("51"));
    }
}
