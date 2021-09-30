package Model1;

public class Boat {
    
    private String boatName;

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
