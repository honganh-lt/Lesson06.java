package Lesson6;

import java.util.Scanner;
import java.lang.String;

public class Lab06_01 {
    public static void main(String[] args) {
        String[] arrSinhVien = new String[3];
        // Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nhập sinh vien thu %d:");
            Scanner input = new Scanner(System.in);
            arrSinhVien[i] = input.nextLine();
        }
        for (String arrSinhVien1 : arrSinhVien) {
            System.out.println(arrSinhVien1);
        }

    }
}
