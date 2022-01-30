package RegularExpression;

import java.util.Scanner;

public class checkWeb {
    static Scanner nhap = new Scanner(System.in);

    public static void check(String web) {
        if (!web.matches("((https://)|(https://)).+('.'.+)+")) {
            System.out.println("Trang web ko phu hop, vui long nhap lai :");
            web = nhap.nextLine();
            check(web);
        } else
            System.out.println("Trang web phu hop");
    }
}