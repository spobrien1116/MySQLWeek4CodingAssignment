package Optional3;

import java.util.NoSuchElementException;
// import java.util.Scanner;
import java.util.Optional;

import Service3.OptionalService;
import Model1.Boat;

public class Optionals {
    
    // private Scanner scanner = new Scanner(System.in);
    private OptionalService service = new OptionalService();
    private Boat boat = new Boat();
    public static void main(String[] args) {

        // new Optionals().run();
        new Optionals().boatsMethodA();
    }

    public Boat boatsMethodA(Optional<Boat> optionalBoat) {
        String search = optionalBoat;

        try {
            String found = service.find(search);
            System.out.println("We found " + found + ". Yay, it works!");
        }
        catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
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
}
