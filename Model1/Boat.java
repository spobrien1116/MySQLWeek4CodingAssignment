package Model1;

public class Boat {
    
    private String boatName;

    //Default constructor
    //This was added in to test the SortDao with a new Boat with no value assigned to it.
    //This is tested in Optional3.Optionals.java. Line 66 runs a for loop to test each boat.
    //Previously, when it reaches the last element in the list it prints out null: Boat when
    //looking at the default constructor of new Boat(). Not ideal, but still good to know for 
    //future testing. Since it was causing issues with the previous parts of the assignment,
    //it has been removed.
    public Boat(){}

    public Boat(String name) {
        this.boatName = name;
    }

    @Override
    public String toString() {
        return boatName + ": Boat";
    }

    public String getBoatName() {
        return boatName;
    }

    public static int compareBoats(Boat b1, Boat b2) {
        return b1.boatName.compareTo(b2.boatName);
    }

}
