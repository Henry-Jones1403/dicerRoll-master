package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many sides are there to your dice>");
        int sides = input.nextInt();
        System.out.println("How many times would you like to throw the dice?");
        int repeats = input.nextInt();
        HashMap<Integer, Integer> thrown = new HashMap<Integer, Integer>();
        for (int i = 0; i < sides+1; i++) {
            thrown.put(i, 0);
        }for (int i = 0; i < repeats; i++){
            int randomNumber = (random.nextInt((sides)))+1;
            thrown.put(randomNumber, thrown.get(randomNumber) + 1);
        }
        for (int i = 0; i < sides; i++) {
            double percentage = (((double)(thrown.get(i+1)) / (double)(repeats)) * 100);
            System.out.println("you rolled a " + (i+1) + " " + thrown.get(i+1) + " times!!! This made up " + percentage + "% of the rolls" );

        }
    }
}
