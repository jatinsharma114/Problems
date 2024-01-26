package com.example.autowire.arrayInJava;

public class My2DArray {

    //2D arrays in java :
    public static void main(String[] args) {

        int[][] array = new int[3][6];
        int length = array.length;
        System.out.println("L : " +  length);

        //First Row mtlb huwa Index -> 0
        array[0][0] =  11;
        array[0][1] = 22;
        array[0][2] = 77;

        System.out.print(array[0][0] + " ");
        System.out.print(array[0][1]+ " ");
        System.out.print(array[0][2]);

        System.out.println();

        //Second Row mtlb index -> 1
        array[1][0] =  12;
        array[1][1] = 32;
        array[1][2] = 53;

        System.out.print(array[1][0] + " ");
        System.out.print(array[1][1]+ " ");
        System.out.print(array[1][2]);
        System.out.println();

        System.out.println("---------------");

        int[][] fresh = new int[3][3];
        int insertValue = 22;

        for(int i = 0 ; i < fresh.length; i++) {

            for (int j = 0; j < fresh.length; j++) {
                //Pick the First Row and add the Values in the column.!!!
                fresh[i][j] = insertValue;
                insertValue++;
            }
        }

        for(int i = 0 ; i < fresh.length; i++) {
            for (int j = 0; j < fresh.length; j++) {
                System.out.print(fresh[i][j] + " ");
            }
            System.out.println();
        }





    }

}
