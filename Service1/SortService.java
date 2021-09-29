package Service1;

import java.util.Comparator;
import java.util.List;

import Dao1.SortDao;
import Model1.Boat;

public class SortService {
    
    private SortDao sortDao = new SortDao();

    public List<Boat> getBoats(SortType type) {
        List<Boat> boats = sortDao.getBoats();
        Comparator<Boat> comp = null;

        switch(type) {
            case LAMBDA:
            comp = (b1, b2) -> Boat.compareBoats(b1, b2);
            break;
            
            case METHOD_REFERENCE:
                comp = Boat::compareBoats;
                break;
            
            default:
                throw new RuntimeException("Unhandled sort type: " + type);

        }

        boats.sort(comp);
        return boats;
    }

    // //This was part of the video, it implements the Comparable interface. Instead, we are instructed
    // //to create  our own method to compare.
    // static class MySort implements Comparator<Boat> {
    //     @Override
    //     public int compare(Boat b1, Boat b2) {
    //         return Boat.compareBoats(b1,b2);
    //     }
    // }

}
