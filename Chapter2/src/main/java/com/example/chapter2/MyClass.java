package com.example.chapter2;

import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        int a = 5;
        for(int i=0; i<10 ; i++)
        {
            System.out.println(a + " x " + (i+1) + " = " + (a*(i+1)));
        }
    }
}