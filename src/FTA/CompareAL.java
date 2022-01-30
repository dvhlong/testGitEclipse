package FTA;

import java.util.Comparator;

public class CompareAL implements Comparator<PersonS> {

    @Override
    public int compare(PersonS p1, PersonS p2) {
        if (p1.getGioiTinh().equals(p2.getGioiTinh()))
            return 0;
        else if (p1.getGioiTinh().compareTo(p2.getGioiTinh())>0) 
            return 1;
        else 
            return -1;
    }
    
}