package Lesson6;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class Lab06_04 {
    public class Book {
        private String bookName;
        private String nxb;
        private int yearOfPublish;
        private String author;
        private int numOfPage;
        private float price;

        public void nhapDuLieu() {
            System.out.println("Nhap du lieu cho sach: ");
            Scanner input = new Scanner(System.in);
            System.out.println("Tên Sách: ");
            this.bookName = input.nextLine();
            System.out.println("\nNha xuat ban: ");
            this.nxb = input.nextLine();
            System.out.print("\nNam xuat ban: ");
            this.yearOfPublish = input.nextInt();
            System.out.println("\nTac gia: ");
            this.author = input.nextLine();
            System.out.println("\nSo trang:  ");
            this.numOfPage = input.nextInt();
            System.out.println("Gia: ");
            this.price = input.nextInt();

        }

        public String toString() {
            return "Book {" + "bookName=" + bookName + ", nxb=" + nxb + ", year=" + yearOfPublish + ", author" + author + "num" + numOfPage + ", price=" + price + "}";
        }
    }

    ArrayList<Book> listBook = new ArrayList<>();

    public void nhapDuLieu() {
        System.out.println("So sach muon nhap?");
        Scanner input = new Scanner(System.in);
        int cnt = input.nextInt();
        for (int i = 0; i < cnt; i++) {
            System.out.println("Nhap cuon thứ: " + (i + 1));
            Book book = new Book();
            book.nhapDuLieu();
            listBook.add(book);
        }
    }

    public void hienThiDanhSach() {
        System.out.println("So sach trong thu vien: ");
        for (int i = 0; i < listBook.size(); i++) {
            Book get = listBook.get(i);
            System.out.println((i + 1) + " " + get.toString());
        }
        System.out.println("-----------------------------------------");
    }

    public void xoaSach() {
        System.out.println("Nhap so thu sach muon xoa: ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if (id < listBook.size() && id >= 0) {
            listBook.remove(id);
        }
        System.out.println("Xóa thành công!");
    }

    public int showMenu() {
        System.out.println("Menu:");
        System.out.println("1.Nhap du lie: ");
        System.out.println("2.Hien thi danh sach: ");
        System.out.println("3.Xóa");
        System.out.println("4.Thoát");
        System.out.println("Vui long nhap tư 1 -> 4");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void main(String[] args) {
        int choose;
        Lab06_04 main = new Lab06_04();
        do {
            choose = main.showMenu();
            switch (choose) {
                case 1:
                    main.nhapDuLieu();
                    break;
                case 2:
                    main.hienThiDanhSach();
                    break;
                case 3:
                    main.xoaSach();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }

}
