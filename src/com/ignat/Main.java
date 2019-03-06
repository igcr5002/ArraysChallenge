package com.ignat;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers (int number) {

        System.out.println("Enter " + number + " values:\r");

        int[] values = new int[number];
        for (int i=0;i<values.length;i++) {

            values[i]=scanner.nextInt();

        }
        return values;

    }

    public static void printArray (int[] array) {

        for (int i=0;i<array.length;i++) {
            System.out.println("Element " + (i+1) + " is " + array[i]);
        }

    }

    public static int[] sortIntegers (int[] vectorCopiat) {
//        int[] sortedArray = new int[vectorCopiat.length];
//        for (int i=0; i<vectorCopiat.length;i++) {
//            sortedArray[i]=vectorCopiat[i];
//        } MAI JOS METODA DE COPIAT UN VECTOR FOLOSIND O FUNCTIE JAVA (o linie in loc de 4)
        int[] sortedArray = Arrays.copyOf(vectorCopiat,vectorCopiat.length);


        int value;
        for (int i=0;i<sortedArray.length-1;i++) {

            for (int j=i+1;j<sortedArray.length;j++) {

                if (sortedArray[i]<sortedArray[j]) {
                    value=sortedArray[i];
                    sortedArray[i]=sortedArray[j];
                    sortedArray[j]=value;
                }
            }

        }
        return sortedArray;

    }

    public static void main(String[] args) {

        int[] integerValues = getIntegers(5);
        printArray (integerValues);
        int[] sortedValues = sortIntegers(integerValues);
        printArray(sortedValues);
    }
}
