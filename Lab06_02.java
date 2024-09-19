package Lesson6;

import java.lang.String;
import java.lang.Float;
import java.util.Scanner;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

public class Lab06_02 {
    String arrNhanVien[][] = new String[3][2];

    public void nhapDuLieu() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.printf("Nhap thong tin nhan vien thư:", i + 1);
            Scanner input = new Scanner(System.in);
            arrNhanVien[i][0] = input.nextLine();
            arrNhanVien[i][1] = input.nextLine();
        }
        System.out.println("Cảm ơn đã nhập dữ liệu");
    }

    public void sapXep() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            for (int j = i + 1; j < arrNhanVien.length; j++) {
                if (Float.parseFloat(arrNhanVien[j][1]) < Float.parseFloat(arrNhanVien[i][1])) {
                    String temp[][] = new String[1][2];

                    //Đổi chỗ
                    temp[0][0] = arrNhanVien[j][0];
                    temp[0][1] = arrNhanVien[j][1];

                    arrNhanVien[j][0] = arrNhanVien[i][0];
                    arrNhanVien[j][1] = arrNhanVien[i][1];

                    arrNhanVien[i][0] = temp[0][0];
                    arrNhanVien[i][1] = temp[0][1];
                }
            }
        }
    }

    public void hienThi() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.println(arrNhanVien[i][0] + "-" + arrNhanVien[i][1]);
        }
    }

    public static void main(String[] args) {
        Lab06_02 main = new Lab06_02();
        main.nhapDuLieu();
        main.sapXep();
        main.hienThi();
    }
}
