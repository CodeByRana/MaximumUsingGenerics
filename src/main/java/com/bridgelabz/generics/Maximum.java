package com.bridgelabz.generics;

public class Maximum{
    public static void main(String[] args) {
        System.out.println("Welcome To Find maximum number");
    }
    // Passed the Integer
    static Integer getMax(Integer a, Integer b, Integer c) {
        // Compare the Value
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        }
        else if (b.compareTo(a) > 0 && b.compareTo(c) >0){
            return b;
        }else {
            return c;
        }
    }
    // Passed the Float Value
    public static Float getMax(Float a, Float b, Float c) {
        // Compare the Float Value
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        }
        return c;
    }
}
