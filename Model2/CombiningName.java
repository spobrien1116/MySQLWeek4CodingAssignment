package Model2;

import java.util.Objects;

public class CombiningName {
    
    // private String combinedName;
    private String name;

    public CombiningName(String name) {
        this.name = Objects.requireNonNull(name, "Requires a name, cannot be null.");
        // this.combinedName = makeCombinedName(name);
        // Objects.requireNonNull(this.combinedName, "The name " + name + "cannot be blank, it must have one or more characters.");
    }

    // public String getCombinedName() {
    //     return combinedName;
    // }

    public String getName() {
        return name;
    }

//     private static String makeCombinedName(String name) {
//         if(Objects.isNull(name) || name.trim().isEmpty()) {
//             throw new RuntimeException("Name must not be null or empty.");
//         }

//         String trimmed = name.trim();
        
//         for (int i = 1; i < List<Boat>.length(); i++) {
//             combinedName+= List<Boat>[i];
//         }
//         return combinedName;
//     }

}
