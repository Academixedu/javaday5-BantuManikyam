package com.example;

public class Calc {
    public static void main(String[] args) {
        int a,b;
        a=5;
        b=6;
        
        String name = "Manikyam";    
        System.out.println("C "+sum(a,b));
        greetMethod(name);
    }
    public static void greetMethod(String name){
        System.out.println("Hello "+name);

    }
    public static String sum(int a,int b){
        String  sum =""+ a + b;
        return sum;
    }
}
