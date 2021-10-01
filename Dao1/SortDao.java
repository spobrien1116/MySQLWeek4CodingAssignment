package Dao1;

import java.util.ArrayList;
import java.util.List;

import Model1.Boat;

public class SortDao {
    
    List<Boat> boats = new ArrayList<>(List.of(new Boat("Sloop"), new Boat("Barque"), new Boat("Brigantine"),
    new Boat("Frigate"), new Boat("Galleon"), new Boat("Galley"), new Boat("Ketch"),
    new Boat("Man O' War")));
    //Adding in another boat as a default constructor new Boat() ended up causing previous parts to fail.

    public List<Boat> getBoats() {
        return boats;
    }

    //This method was created for use in Optional3.Optionals.java. I wanted to be able to use a for loop
    //to go through the list of boats here.
    public Boat getABoat(int index) {
        if (index >= boats.size()) {
            return boats.get(0);
        } else {
            return boats.get(index);
        }
    }
}
