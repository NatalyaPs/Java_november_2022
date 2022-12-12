// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

package home_work_05;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class hw_5_2_employees_repeats_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");
        List<String> name = new LinkedList<>();

        while (true){
            System.out.println("введите имя: ");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            else {
                name.add(input);
            }
        }
        scanner.close();
        System.out.printf("Исходный список: " + name + "\n");
        
        name.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.printf("Отсортированный список: " + name + "\n");

        HashMap<String, Integer> nameCount = new HashMap<>();
        int count = 0;
        for (int i = 0; i < name.size(); i++) {
            count += 1;
            // nameCount.put(name.get(i), count);
            if ((i + 1) == name.size() || !name.get(i).equals (name.get(i+1))) {
                nameCount.put(name.get(i), count);
                count = 0;
            }
        }
        System.out.printf("Количество повторений: " + nameCount + "\n");


        Map<String, Integer> sortedMap = nameCount.entrySet().stream() 
            .sorted(Comparator.comparingInt(e -> -e.getValue())) 
            .collect(Collectors.toMap( 
            Map.Entry::getKey, 
            Map.Entry::getValue, 
            (a, b) -> { throw new AssertionError(); }, 
            LinkedHashMap::new 
            )); 
            System.out.println("Сортировка по убыванию популярности: ");
            sortedMap.entrySet().forEach(System.out::println); 
    }  
}
// сортировка по значению: https://rukovodstvo.net/posts/id_600/