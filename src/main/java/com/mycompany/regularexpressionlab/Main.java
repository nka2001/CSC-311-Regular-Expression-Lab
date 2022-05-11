/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.regularexpressionlab;

/**
 *
 * @author soblab
 */
public class Main {

    public static void main(String[] args) {

        String regex;
        regex = "[d-h]";
        System.out.printf("%10s %10s %10s\n", "String", "Regex", "Result");
        testStrings("e", regex);
        testStrings("l", regex);

        //match any digit
        regex = "\\d";
        testStrings("4", regex);
        testStrings("L", regex);

        //match two characters
        regex = "[a-z]\\d";
        testStrings("a3", regex);
        testStrings("AA", regex);

        //match any number of characters
        regex = ".*";

        testStrings("aehbfuiwefbebfowebnoibnewof", regex);
        testStrings("", regex);

        //match any digits
        regex = "\\d*";

        testStrings("123456789", regex);
        testStrings("a1", regex);
        testStrings("1a", regex);//Still returns flase since its not digits

        regex = "\\d[a-z]*";

        testStrings("1apppppfff", regex);
        testStrings("apppppfff", regex);

        regex = ".*[qQ]";
        testStrings("abcq", regex);
        testStrings("abc", regex);

        regex = "\\d+cd\\d*";
        testStrings("77cd22", regex);
        testStrings("4454fdfwef", regex);
    }

    public static void testStrings(String str, String regex) {

        //match any character
        boolean result = false;
        result = str.matches(regex);
        System.out.printf("%10s %10s %10b\n", str, regex, result);

    }

}
