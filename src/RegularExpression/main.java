package RegularExpression;

import java.util.Scanner;

public class main {
    static Scanner nhap = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap Ma Sinh Vien ");
        String msv = nhap.nextLine();
        checkID.check(msv);
        // C1: Su dung nhieu bieu thuc chinh quy
        System.out.println("Nhap mat khau :");
        String psv = nhap.nextLine();
        checkPassV1.check(psv);
        // C2: chi su dung 1 bieu thuc chinh quy
        System.out.println("Nhap mat khau v2:");
        psv = nhap.nextLine();
        checkPassV2.check(psv);
        System.out.println("Nhap ten trang web :");
        String web = nhap.nextLine();
        checkWeb.check(web);
    }
}