package com.metanit;
public class Main {

    public static void main(String[] args) {
	int a[][] = new int [3][3];
    int min = 0;
    int max = 20;
    int b;
    for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a.length; j++){
            a[i][j] = min + (int) (Math.random() * (max - min + 1));
        }
    }
    for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a.length; j++){
            for (int k = j + 1; k < a.length; k++){
                if (a[i][j] > a[i][k]){
                    b = a[i][j];
                    a[i][j] = a[i][k];
                    a[i][k] = b;
                }
            }
        }
    }
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    }
}
