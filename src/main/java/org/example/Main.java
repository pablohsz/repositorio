package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        System.out.println(adicao(a, b));
        c = in.nextInt();
        System.out.println(adicao(a, b, c));
    }

    public static int adicao(int a, int b) {
        return a + b;
    }

    public static int adicao(int a, int b, int c) {
        return a + b;
    }
}