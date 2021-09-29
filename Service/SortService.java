package Service;

import java.util.Comparator;
import java.util.List;

import Model.Boat;
import Dao.SortDao;

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

    static class MySort implements Comparator<Boat> {
        @Override
        public int compare(Boat b1, Boat b2) {
            return Boat.compareBoats(b1,b2);
        }
    }
}
