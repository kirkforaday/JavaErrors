package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = input.next();
	System.out.printf("Hello %s. \n", name);
    }
}

//Used the wrong variable name
//java: cannot find symbol
//		symbol:   variable Ryan
//		location: class com.company.Main

//Did not define a variable for string
//java: cannot find symbol
//		symbol:   variable String
//		location: class com.company.Main

//Left Parenthesis off of input.next()
//java: cannot find symbol
//		symbol:   variable next
//		location: variable input of type java.util.Scanner

//Did not import the Java Scanner
//java: cannot find symbol
//		symbol:   class Scanner
//  location: class com.company.Main