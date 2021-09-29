package Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Boat;

public class SortDao {
    
    List<Boat> boats = new ArrayList<>(List.of(new Boat("Sloop"), new Boat("Barque"), new Boat("Brigantine"),
    new Boat("Frigate"), new Boat("Galleon"), new Boat("Galley"), new Boat("Ketch"),
    new Boat("Man O' War")));

    public List<Boat> getBoats() {
        return boats;
    }
}
