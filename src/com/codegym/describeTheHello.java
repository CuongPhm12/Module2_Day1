package com.codegym;

import java.util.Scanner;

public class describeTheHello {
    public static void main(String[] args) {
//        Trong phần này, chúng ta sẽ phát triển một ứng dụng Java cho phép nhập tên của người dùng từ bàn phím,
//        sau đó hiển thị lời chào kèm theo tên của người đó.
//
//        Enter your name:
//        Bill Gates
//        Hello: Bill Gates
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello:"+ name);
    }
}
