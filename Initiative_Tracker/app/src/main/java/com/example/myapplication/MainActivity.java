package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    public static void main(String[] args) {

        //instantiate objects
        Character Char1 = new Character("Justin", 1);

        System.out.println(Char1.getName());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
