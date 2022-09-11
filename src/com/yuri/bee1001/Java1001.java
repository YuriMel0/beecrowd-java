package com.yuri.bee1001;

import java.util.Scanner;

public class Java1001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();

        int x = a + b;

        System.out.println("X = " + x);
    }
}
