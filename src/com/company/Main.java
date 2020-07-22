package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        int[] tabliczka = getIntegers(5);
        printArrays(tabliczka);
        int[] sortedtabliczka = sortIntegers(tabliczka);
        printArrays(sortedtabliczka);

    }
    public static int[] getIntegers(int number){
        int [] values = new int[number];
        for (int i=0; i<values.length; i++){
            values[i] =scanner.nextInt();

        }
        return values;
    }
    public static void printArrays(int[] tab){
        for(int i=0; i<tab.length ; i++){
            System.out.println("Element nr " + i + " equals " + tab[i]);
        }
    }
    public static int[] sortIntegers(int[] tab){
        int []sortedArray = new int[tab.length];
        for(int i=0; i<tab.length; i++){
            sortedArray[i] = tab[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i =0; i<sortedArray.length-1;i++){
                if(sortedArray[i] < sortedArray [i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray [i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
//        int counter = tab.length;
//        while(counter != 2){
//            System.out.println(tab[counter]);
//            System.out.println(tab[counter-1]);
//           if(tab[counter] < tab[counter-1]){
//               int i = tab[counter];
//               int j = tab[counter-1];
//               tab[counter] = j;
//               tab[counter-1] = i;
//               System.out.println(counter);
//               counter --;
//               System.out.println(counter);
//           }
//           else
//               counter--;
//        }
//
   }
}
