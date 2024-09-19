package Lesson6;
/*
-Mảng 1 chiều
+ Khai báo và khởi tạo kic thước của mảng
+ Truy cập đến các ptu trong mảng
++gán giá trị
++ lấy giá trị
+Sawpsps xếp, tìm kiếm, các thao tác chnef, xóa,.....
 */

import java.util.Random;

import static java.lang.Math.random;

public class Mang1chieu {
    public static void main(String[] args) {
        //Khai báo....
        int[] arr;
        //Khởi tạo kích thước mảng
        arr = new int[10];  //index: 0,1,...,9
        //Gán giá trị cho các phần tử trong mảng
        arr[0] = 10;
        arr[5] = 20;
        arr[9] = 30;

        //duyệt mảng lấy giá trị để hiện thi
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d", arr[i]);
        }

        //gán giá trị ngẫu nhiên cho ptu trong mảng
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(99);
            System.out.printf("%4d", arr[i]);
        }

        //Sắp xếp
        for (int i = 0; i < 10; i++) {  //Thuật toán sủi bọt
            for (int j = i + 1; j < 9; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //int mảng đã săp
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d", arr[i]);
        }
    }
}
