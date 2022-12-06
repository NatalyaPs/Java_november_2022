package METHODS;

import java.util.ArrayList;
import java.util.Random;

public class random_list {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();   // или так  ArrayList list = new ArrayList<>();
        for (int i = 0; i < 10; i++) 
        {
            list.add(random.nextInt(1, 100));
        }

        for (int item : list) 
        {
            System.out.print(item + " ");
        }
    }
}
