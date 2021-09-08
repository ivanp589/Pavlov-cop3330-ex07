package org.example;


import java.util.Scanner;

import static java.lang.System.out;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        double c = .09290304;
    App ask = new App();
    int width = ask.width();
    int length = ask.length();
    int ft2 = ask.ft2math(width,length);
    double m2 = ask.m2math(width,length,c);
    String outp = ask.outp(width,length,ft2,m2);


        out.println( outp );
    }

    private int width(){
        out.print("What is the length of the room in feet? ");
        return in.nextInt();
    }

    private int length(){
        out.print("What is the width of the room in feet? ");
        return in.nextInt();
    }

    private String outp(int width,int length, int ft2, double m2){
        return String.format("You entered dimensions of %d feet by %d feet.\n" +
                "The area is\n" +
                "%d square feet\n" +
                "%f square meters", width,length, ft2, m2);
}
private int ft2math(int w,int l){
        return l*w;
}
private double m2math (double w,double l,double c){
        return l*w*c;
}
}
