package Optional3;

import java.util.NoSuchElementException;
import java.util.Scanner;

import Service3.OptionalService;

public class Optionals {
    
    private Scanner scanner = new Scanner(System.in);
    private OptionalService service = new OptionalService();
    public static void main(String[] args) {

        new Optionals().run();
    }

    private void run() {
        boolean done = false;

        while (!done) {
            System.out.print("Please enter a String: ");
            String search = scanner.nextLine();

            if (search.isEmpty()) {
                done = true;
            }
            else {
                try {
                String found = service.find(search);
                System.out.println("It seems you entered " + found + ".");
                }
                catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
