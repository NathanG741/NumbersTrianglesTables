package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evens = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evens = evens + i;
            }
        }
        return evens;
    }


    public static String getOddNumbers(int start, int stop) {
        String odds = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 1) {
                odds = odds + i;
            }
        }
        return odds;    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squares = "";
        for (int i = start; i < stop; i = i + step) {
            squares = squares + (i*i);
        }
        return squares;
    }

    public static String getRange(int stop) {
        String range = "";
        for (int i = 0; i < stop; i++) {
            range = range + i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++) {
            range = range + i;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i = i + step) {
            range = range + i;
        }
        return range;    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponents = "";
        for (int i = start; i < stop; i = i + step) {
            exponents = exponents + Math.round(Math.pow(i, exponent));
        }
        return exponents;    }
}
