package METHODS;

import java.util.ArrayList;

public class max_min {
  
    public static void main(String args[]){
        System.out.println(Math.min(1.123, 1.456));      
        System.out.println(Math.min(2.12, 2.0)); 
        System.out.println(Math.min(-5.2, -5.1));
        System.out.println(Math.min(0, -1.1));
    }
 
    public static void main1(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(-666);
        list.add(666);

        int min = list.get(0);
        int max = list.get(0);

        for (Integer i: list) {
            if(i < min) 
                min = i;
            if(i > max) 
                max = i;
        }

        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
    }

    public static void main2(String[] args) {
        // System.out.println(list.get(list.size() - 1));

    }
}
