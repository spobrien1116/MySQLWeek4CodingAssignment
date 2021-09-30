package Streaming2;

import Service2.CombiningService;
// import Model2.CombiningName;

public class Streaming {
    
    private CombiningService combiningService = new CombiningService();
    // private CombiningName combiningName = new CombiningName();
    public static void main(String[] args) {
        new Streaming().run();
    }

    private void run() {
        String name = combiningService.makeCombinedName();

        System.out.println(name);
    }
}
