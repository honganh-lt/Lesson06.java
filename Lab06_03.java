package Lesson6;

//import java.util.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;

public class Lab06_03 {
    ArrayList<String> listMonHoc = new ArrayList<>();

    public void test() {
        listMonHoc.add("Java");
        listMonHoc.add("SQL");
        listMonHoc.add("PHP");
        listMonHoc.add("C#");
        listMonHoc.add("Android");

        System.out.println("Danh sách chua sắp xêp: ");
        for (int i = 0; i < listMonHoc.size(); i++) {
            String get = listMonHoc.get(i);
            System.out.println((i + 1) + " " + get);
        }
        //Sắp xếp thứ tự
        Collections.sort(listMonHoc);
        for (int i = 0; i < listMonHoc.size(); i++) {
            String get = listMonHoc.get(i);
            System.out.println((i + 1) + " " + get);
        }
    }

    public static void main(String[] args) {
        Lab06_03 demo = new Lab06_03();
        demo.test();
    }

}
