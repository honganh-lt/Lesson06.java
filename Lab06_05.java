package Lesson6;

import java.lang.String;

public class Lab06_05 {
    void yeuCau1() {
        String vietnam = "Viet Nam";
        System.out.println("concat()=" + vietnam.concat("Cộng hòa XHCN"));
    }

    public static void main(String[] args) {
        Lab06_05 bth5 = new Lab06_05();
        bth5.yeuCau1();
    }

    void yeuCau2() {
        String baoViet = "Tong Cty Bao hiem Viet Nam (Bao hiem Viet - Baoviet)" + "InSurance la Cty thanh vien Tap doan Tai chinh - Bao hiem" + "Bao hiem Dau tu 100 von.";
        System.out.println("length()=" + baoViet.length());
        baoViet = baoViet.replace("Cty", "Công ty");
        System.out.println("replaceAll()=" + baoViet);
    }

    void yeuCau3() {
        String baoViet = "Tong Cty Bao hiem Viet Nam (Bao hiem Viet - Baoviet)" + "InSurance la Cty thanh vien Tap doan Tai chinh - Bao hiem" + "Bao hiem Dau tu 100 von.";
        System.out.println("toUpperCase()=" + baoViet.toUpperCase());
        System.out.println("toLowerCase()=" + baoViet.toLowerCase());
    }

    void yeuCau4() {
        String baoViet = "Tong Cty Bao hiem Viet Nam (Bao hiem Viet - Baoviet)" + "InSurance la Cty thanh vien Tap doan Tai chinh - Bao hiem" + "Bao hiem Dau tu 100 von.";
        System.out.println("lastIndexOf()=" + baoViet.lastIndexOf("báo Việt"));
    }

    void yeuCau5() {
        String baoViet = "Tong Cty Bao hiem Viet Nam (Bao hiem Viet - Baoviet)" + "InSurance la Cty thanh vien Tap doan Tai chinh - Bao hiem" + "Bao hiem Dau tu 100 von.";
        String[] arrBaoViet = baoViet.split(" ");
        for (int i = 0; i < arrBaoViet.length; i++) {
            String arrBaoViet1 = arrBaoViet[i];
            if ((i % 2) == 0) {
                System.out.println("\t" + arrBaoViet1);
            } else {
                System.out.println(arrBaoViet1);
            }
        }
    }
}
