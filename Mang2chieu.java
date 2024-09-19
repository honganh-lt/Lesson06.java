package Lesson6;

public class Mang2chieu {
    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        //Khai báo mảng
        int[][] arr = new int[row][col];

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
    }
}
