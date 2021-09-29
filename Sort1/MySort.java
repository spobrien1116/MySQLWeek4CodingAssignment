package Sort1;

import java.util.List;

import Model1.Boat;
import Service1.SortService;
import Service1.SortType;

public class MySort {
    
    private SortService sortService = new SortService();
    
    public static void main(String[] args) {
        new MySort().run();
    }

    private void run() {
        System.out.println("Sorted using LAMBDA:");
        List<Boat> boats1 = sortService.getBoats(SortType.LAMBDA);
        print(boats1, SortType.LAMBDA);
        System.out.println("Sorted using METHOD_REFERENCE:");
        List<Boat> boats2 = sortService.getBoats(SortType.METHOD_REFERENCE);
        print(boats2, SortType.METHOD_REFERENCE);
    }

    private void print(List<Boat> boats, SortType type) {
        switch(type) {
            
            case LAMBDA:
                boats.forEach(boat -> System.out.println(boat.getBoatName()));
                break;
            
            case METHOD_REFERENCE:
                boats.forEach(System.out::println);
                break;
            
            default:
                break;

        }
    }
}
