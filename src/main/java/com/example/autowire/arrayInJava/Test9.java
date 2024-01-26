package com.example.autowire.arrayInJava;

public class Test9 {

    public static void main(String[] args) {

        int[][] firstArray = {{1,2,3}, {1,2,3}, {1,2,3}};
        //Legth ka mtlb ROW kitni hai...
        System.out.println("fir : " + firstArray.length); // 3 -> Rows hai!!!
        int[][] secondArray = {{1,2,3}, {1,2,3}, {1,2,3}};
        int[][] store = new int[3][3];

        for ( int i =0; i < firstArray.length ; i++ ) {
            for ( int j =0; j < firstArray.length; j++) {

                int i1 = firstArray[i][j]; //PhlLi wali row m s phla Index value
                int i2 = secondArray[i][j];
                store[i][j] =  i1 + i2;
            }
        }
        for ( int i =0; i < store.length ; i++ ) {
            for ( int j =0; j < store.length; j++) {
                System.out.print(store[i][j] + " ");
            }
            System.out.println();
        }










    }
}
