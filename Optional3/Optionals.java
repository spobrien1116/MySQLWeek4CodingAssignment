package Optional3;

import java.util.NoSuchElementException;
// import java.util.Scanner;
import java.util.Optional;
import java.util.List;

import Service3.OptionalService;
import Model1.Boat;
import Dao1.SortDao;

public class Optionals {
    
    // private Scanner scanner = new Scanner(System.in);
    private OptionalService service = new OptionalService();
    private static SortDao sortDao = new SortDao();

    public static void main(String[] args) {

        // new Optionals().run();
        //The below line is my attempt to pass through the List of boats into the optional.
        //Attempt is not working. Hard stuck here.
        System.out.println(boatsMethodA(getBoats()));
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

    public Boat boatsMethodA(Optional<Boat> optionalBoat) {
        //Trying to create a for loop here that will run each String of boat through the service.
        //Unsucessful so far.
        for (int i = 0; i < optionalBoat.length() - 1; i++) {
            String search = optionalBoat[i];
            try {
                String found = service.find(search);
                System.out.println("We found " + found + ". Yay, it works!");
            }
            catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }
        }
        return optionalBoat;
    }

}
