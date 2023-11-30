package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;

        a = in.nextInt();
        b = in.nextInt();
        System.out.println(adicao(a,b));
    }

    public static int adicao(int a, int b){
        return a + b;
    }
}