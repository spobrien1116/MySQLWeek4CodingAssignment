package Service3;

import java.util.NoSuchElementException;

import Dao3.OptionalDao;

public class OptionalService {
    
    private OptionalDao dao = new OptionalDao();

    public String find(String search) {
        return dao.find(search).orElseThrow(() -> new NoSuchElementException("Your search of " + search + " is missing."));
    }
    
}
