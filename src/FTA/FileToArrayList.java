package FTA;

import java.util.*;
import java.io.*;

public class FileToArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader bRead = null;
        ArrayList<PersonS> dssv = new ArrayList<PersonS>();
        Scanner nhap = new Scanner(System.in);
        System.out.print("File Direction :");
        try {
            bRead = new BufferedReader(new FileReader(nhap.nextLine()));
            String sLine;
            PersonS p;
            while ((sLine = bRead.readLine()) != null) {
                p = PersonS.parse(sLine);
                dssv.add(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bRead.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Collections.sort(dssv, new CompareAL());
        System.out.println("Student List :");
        for (int i = 0; i < dssv.size(); i++) {
            System.out.print(String.valueOf(i + 1) + '.' + ' ');
            System.out.println(dssv.get(i).toString());
        }
    }
}