package com.codegym;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float width;
    float height;
    Scanner scanner = new Scanner(System.in);//khai báo đối tượng Scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat();//Nhập chiều rộng;

        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Nhập chiều dài;

        float area = width * height;
        System.out.println("Area= " + area);
    }
}