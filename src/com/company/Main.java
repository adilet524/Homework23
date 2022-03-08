package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            int randomNumber = random.nextInt(100);
            arrayList.add(randomNumber );
        }
        System.out.println("It's all numbers: ");
        System.out.println(arrayList +  "\n");


        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i: arrayList) {
            if(i % 2 == 0) {
                arrayList1.add(i);
            }
        }
        System.out.println("This numbers are divisible by two!");
        System.out.println(arrayList1 + "\n");


        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i: arrayList) {
            if(i % 2 != 0) {
                arrayList2.add(i);
            }
        }
        System.out.println("This numbers aren't divisible by two");
        System.out.println(arrayList2 + "\n");
    }
}
