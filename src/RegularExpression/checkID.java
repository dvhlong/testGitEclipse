package RegularExpression;
import java.util.Scanner;
public class checkID {
    static Scanner nhap=new Scanner(System.in);
    public static void check(String ID) {
        if(!ID.matches("\\d{2}T\\d{7}")) {
            System.out.println("Ma sinh vien ko phu hop, vui long nhap lai :");
            ID=nhap.nextLine();
            check(ID);
        }
        else
            System.out.println("Ma sinh vien phu hop");
    }
}