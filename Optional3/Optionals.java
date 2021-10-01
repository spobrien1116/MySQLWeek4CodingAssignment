package Optional3;

import java.util.NoSuchElementException;
// import java.util.Scanner;
import java.util.Optional;
import java.util.List;

// import Service3.OptionalService;
import Model1.Boat;
import Dao1.SortDao;

public class Optionals {
    
    // private Scanner scanner = new Scanner(System.in);
    // private OptionalService service = new OptionalService();
    private static SortDao sortDao = new SortDao();

    public static void main(String[] args) {

        // new Optionals().run();
        //Calls on boatsMethodB to start the whole program. boatsMethodB then calls on boatsMethodA
        //with the list of boats, and also as an empty Optional.
        boatsMethodB();
    }

    public static List<Boat> getBoats() {
        List<Boat> boats = sortDao.getBoats();
        return boats;
    }

    // private void run() {
        // // This section is from this week's video. Use it to find a way to make the assignment work.
        // boolean done = false;

        // while (!done) {
        //     System.out.print("Please enter a String: ");
        //     String search = scanner.nextLine();

        //     if (search.isEmpty()) {
        //         done = true;
        //     }
        //     else {
        //         try {
        //         String found = service.find(search);
        //         System.out.println("It seems you entered " + found + ".");
        //         }
        //         catch (NoSuchElementException e) {
        //             System.out.println(e.getMessage());
        //         }
        //     }
        // }
    // }

    public static Boat boatsMethodA(Optional<Boat> optionalBoat) {
        //Tests to see if the boat passed in exists or not. If it is empty, it will throw the
        //NoSuchElementException custom message.
        return optionalBoat.orElseThrow(() -> new NoSuchElementException("Your search of " + optionalBoat + " is missing/empty."));
        
    }

    public static void boatsMethodB() {
        //Calls method a with an object wrapped by an Optional. Show that the object is returned unwrapped
        //from the Optional.
        List<Boat> boats = sortDao.getBoats();
        for (int i = 0; i < boats.size(); i++) {
            System.out.println(boatsMethodA(Optional.of(sortDao.getABoat(i))));
        }    
        try {
            System.out.println(boatsMethodA(Optional.empty()).toString());
            // String found = boatsMethodA(Optional.empty()).toString();
            // System.out.println("We found " + found + ". Yay, it works!");
        }
        catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

}
