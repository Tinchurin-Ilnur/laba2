package com.company;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.format("%.2f\n", Math.PI);
            System.out.println("Imput a number");
            double x = in.nextDouble();
            double argone = 3 * Math.PI - 2 * (x);
            double argtwo = 2 * Math.sin(argone);
            double argthree = 5 * Math.PI + 2 * (x);
            double argfour = Math.pow (Math.cos(argthree),2);
            double z = argtwo * argfour ;
            System.out.print(z);
            in.close();
        }
}