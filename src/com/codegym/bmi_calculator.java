package com.codegym;

import java.util.Scanner;

public class bmi_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight(in Kg): ");
        weight = scanner.nextDouble();
        System.out.print("Your height(in Meter): ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation\n" );

        if(bmi<18)
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        else if(bmi<25)
            System.out.printf("%-20.2f%s",bmi,"Normal");
        else if(bmi<30)
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        else
            System.out.printf("%-20.2f%s",bmi,"Obese");




    }
}
