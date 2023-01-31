package sem_08_OOP_2.Homework_06_Product_Wendingmachine;

import java.util.*;

class Homework {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine (Arrays.asList (
            new Product ("закуска"),
            new HotDrinkProduct ("кола", 15),
            new HotDrinkProduct ("вода", 16),
            new HotDrinkProduct ("чай", 17)
        ));

        
        System.out.println (machine.findProduct ("чай", 17));
        // System.out.println (machine.findProduct ("кола", 30));  // Exception in thread "main" java.lang.IllegalStateException: Товар не найден!
    }
}
