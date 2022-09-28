package com.yuri.bee1002;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Java1002 {

    final static double PI = 3.14159;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.0000");

        double raio = teclado.nextDouble();

        double area = PI * (Math.pow(raio, 2));

        System.out.println("A=" + formatador.format(area));
    }
}
