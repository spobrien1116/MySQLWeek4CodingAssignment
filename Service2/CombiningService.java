package Service2;

// import java.util.List;
// import java.util.Map;
import java.util.stream.Collectors;

// import Model2.CombiningName;
import Dao1.SortDao;
import Model1.Boat;

public class CombiningService {

    private SortDao sortDao = new SortDao();
    
    public String makeCombinedName() {
        // 1)Create a stream from the list of objects (SortDao)
        // Stream<Boat> boatStream = getBoats().stream();
        // 2)Turn the Stream of objects to a Stream of String (use the map method for this).
        // Stream type is String, boat type is also String
        // boatStream.map(Boat::toString)   //Import Boat
        // 3)Sort the Stream in the natural order
        // 4)Collect the Stream and return a comma-separated list of names as a single String.
        // Hint: use Collectors.joining(", ") for this.
        // 5)Print the resulting String.
        return sortDao.getBoats().stream()
        .map(Boat::toString)
        .sorted()
        .collect(Collectors.joining(", "));
    }
}
