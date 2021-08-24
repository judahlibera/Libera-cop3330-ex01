/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 judah libera
 */

package com.example.helloworld;

import java.util.*;

public class HelloWorld {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("What is your name? ");
        String str= sc.nextLine();              //reads string
        System.out.printf("Hello, %s, Nice to meet you!", str);
    }
}
