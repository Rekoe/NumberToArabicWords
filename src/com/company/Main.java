package com.company;

public class Main {

    public static void main(String[] args) {

        ArabicTools arabicTools = new ArabicTools();

        arabicTools.isFeminine = true;
        System.out.println(arabicTools.numberToArabicWords("314"));
        System.out.println(arabicTools.numberToArabicWords("696464416455312089898469"));
    }


}
