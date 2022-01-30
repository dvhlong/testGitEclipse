package RegularExpression;

import java.util.Scanner;

public class checkPassV2 {
    static Scanner nhap = new Scanner(System.in);

    public static void check(String pass) {
        if (!pass.matches("(?=.{8,})(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*[0-9].*).*\\W.*")) {
            System.out.println("Mat khau bao mat thap, vui long nhap lai :");
            pass = nhap.nextLine();
            check(pass);
        } else
            System.out.println("Mat khau bao mat cao");
    }
}