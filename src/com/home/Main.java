package com.home;

import com.home.easy.Romans;

public class Main {

    public static void main(String[] args) {
	    //Roman to arabic test
        String romanString = "MCMXCIV";
        System.out.println("Roman year: " + romanString + " Arabic year: " + Romans.roman(romanString));
    }
}
