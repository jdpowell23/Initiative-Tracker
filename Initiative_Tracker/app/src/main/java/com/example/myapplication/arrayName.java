package com.example.myapplication;

import java.util.Scanner;

public class arrayName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] array1 = new String[5];

        System.out.println("Enter a Character Name!");

        for (int i = 0; i<array1.length; i++) {

            array1[i] = input.next();
        }



    }


}
