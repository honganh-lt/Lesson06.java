package Lesson6;

import java.util.Scanner;

public class Mang2chieu2 {
    public static void main(String[] args) {
        int row;// = 3;
        int col;// = 4;
        //Khai báo mảng
        //int[][] arr = new int[row][col];

        //Khai báo và khơ tạo giá trị
        int[][] mang = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}
        };//Mảng gồm có 3 dòng 4 cột
        //In ra các ptu trong mảng(matrix)
        System.out.println("\n Danh sách :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", mang[i][j]);
            }
            System.out.println();
        }
        Scanner input = new Scanner(System.in);
        //Nhập số dong
        System.out.println("Nhap dong:");
        row = input.nextInt();
        //Nhập cot
        System.out.println("Nhập cột:");
        col = input.nextInt();

        //Khai báo mảng
        int[][] arr = new int[row][col];
        System.out.println("Nhập giá trị phần tử trong mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = input.nextInt();
            }
        }
        //Hiển thị
        System.out.println("\n Danh sách :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
