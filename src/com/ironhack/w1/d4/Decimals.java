package com.ironhack.w1.d4;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Decimals {
    public static void main(String[] args) {
        //// BIG DECIMAL
        BigDecimal bd1 = new BigDecimal("15.227326");
        BigDecimal bd2 = new BigDecimal("26.4803");

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN)); // el segundo valor es por lo q queremos q redondee

            /// SET SCALE
                // redondear con los decimales que indicas
                System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN));

            /// COMPARE TO
                // compara y si es positivo el resultado es 1 y si en negativo -1, si es igual el resultado es 0
                System.out.println(bd1.compareTo(bd2));

    }
}
