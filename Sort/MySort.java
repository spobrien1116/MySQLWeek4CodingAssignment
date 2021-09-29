package Sort;

import java.util.List;

import Model.Boat;
import Service.SortType;
import Service.SortService;

public class MySort {
    
    private SortService sortService = new SortService();
    
    public static void main(String[] args) {
        new MySort().run();
    }

    private void run() {
        List<Boat> boats = sortService.getBoats(SortType.METHOD_REFERENCE);
        print(boats, SortType.METHOD_REFERENCE);
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
