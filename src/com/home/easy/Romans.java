package com.home.easy;

import java.util.Locale;

public class Romans {
    public static int roman(String string) {
        if(string != null) {
            string = string.toUpperCase(Locale.ROOT);
            char[] array = string.toCharArray();
            int currentNumber;
            int previousNumber = 0;
            int result = 0;

            for (int i = array.length - 1; i >= 0; i--) {
                switch (array[i]) {
                    case 'I':
                        currentNumber = 1;
                        break;
                    case 'V':
                        currentNumber = 5;
                        break;
                    case 'X':
                        currentNumber = 10;
                        break;
                    case 'L':
                        currentNumber = 50;
                        break;
                    case 'C':
                        currentNumber = 100;
                        break;
                    case 'D':
                        currentNumber = 500;
                        break;
                    case 'M':
                        currentNumber = 1000;
                        break;
                    default:
                        currentNumber = 0;
                }

                if (currentNumber >= previousNumber) {
                    result += currentNumber;
                } else {
                    result -= currentNumber;
                }

                previousNumber = currentNumber;
            }

            return result;
        }

        return -1;
    }
}
