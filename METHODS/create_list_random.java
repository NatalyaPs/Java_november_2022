package METHODS;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class create_list_random {
    public static void main(String[] args) {
        System.out.println(listArray(10, 0, 100));
    }
    // создание и рандомное заполнение листа
    public static List<Integer> listArray(int size, int start, int end) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
        int num = random.nextInt(start, end);
        list.add(num);
        }
        return list;
    }
}
