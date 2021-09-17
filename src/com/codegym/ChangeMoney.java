package com.codegym;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        long usd;
        System.out.println("Nhập vào tiền USD");
        Scanner sc = new Scanner(System.in);
        usd = sc.nextLong();
        long moneyChange = usd * 23000;
        System.out.println("Số tiền VND tương ứng là " + moneyChange);
    }
}
