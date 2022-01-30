package RegularExpression;

import java.util.Scanner;

public class checkPassV1 {
    static Scanner nhap = new Scanner(System.in);

    public static void check(String pass) {
        if (!pass.matches(".{8,}")) {
            System.out.println("Mat khau qua ngan, it nhat la 8 ki tu, vui long nhap lai :");
            pass = nhap.nextLine();
            check(pass);
        } else if (!pass.matches(".*[A-Z].*")) {
            System.out.println("Mat khau bao mat thap, Phai co it nhat 1 ki tu hoa, vui long nhap lai :");
            pass = nhap.nextLine();
            check(pass);
        } else if (!pass.matches(".*[a-z].*")) {
            System.out.println("Mat khau bao mat thap, Phai co it nhat 1 ki tu thuong, vui long nhap lai :");
            pass = nhap.nextLine();
            check(pass);
        } else if (!pass.matches(".*[0-9].*")) {
            System.out.println("Mat khau bao mat thap, Phai co it nhat 1 ki tu so, vui long nhap lai :");
            pass = nhap.nextLine();
            check(pass);
        } else if (!pass.matches(".*\\W.*")) {
            System.out.println("Mat khau bao mat thap, Phai co it nhat 1 ki tu dac biet, vui long nhap lai :");
            pass = nhap.nextLine();
            check(pass);
        } else
            System.out.println("Mat khau bao mat cao");
    }
}