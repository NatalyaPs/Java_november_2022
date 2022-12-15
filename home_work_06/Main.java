/*Подумать над структурой класса Ноутбук для магазина техники - 
выделить поля и методы. Реализовать в java.

Создать множество ноутбуков.
        ==========
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и 
выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например:“Введите цифру, соответствующую необходимому критерию:

1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

package home_work_06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Set<Laptop> laptops = new HashSet<> (); 
    
        laptops.add (new Laptop ("Samsung", "16", "300", "Windows", "black"));
        laptops.add (new Laptop ("Aser", "32", "500", "Linux", "grey"));
        laptops.add (new Laptop ("Apple", "64", "1000", "macOS", "white"));
        laptops.add (new Laptop ("Laptop_4", "16", "500", "Windows", "grey"));
        laptops.add (new Laptop ("Apple", "32", "1000", "macOS", "black"));
        laptops.add (new Laptop ("Samsung", "64", "500", "Linux", "white"));
        laptops.add (new Laptop ("Apple", "16", "1000", "macOS", "black"));
        laptops.add (new Laptop ("Samsung", "32", "1000", "Windows", "Black"));
        laptops.add (new Laptop ("Aser", "64", "1000", "Windows", "grey"));
        laptops.add (new Laptop ("Aser", "16", "300", "Linux", "black"));
        // System.out.println(laptops);

    // public static Map<String, String> searchLaptop() {
        // сохраняем пожелания пользователя в Мар
        Map<String, String> filters = new HashMap<> ();  //  <String - требование, String - значение фильтра - если нет требования пользователя, то кладем сюда null>
    
        Scanner scanner = new Scanner (System.in);
        String[] parameters = {"модель: Samsung, Aser, Apple или null", 
                                "оперативная память: 16, 32, 64 или null", 
                                "жесткий диск: 300, 500, 1000 или null", 
                                "операционная система: Windows, Linux, macOS или null", 
                                "цвет: black, white, grey или null"};
           
        String[] getParameters = {"model", "ram", "hardDisk", "opSystem", "color"};                         
    
        System.out.println("Заполните поля для выбора подходящей модели: ");
        for (int j = 0; j < getParameters.length; j++) {
            System.out.println(parameters[j]);
            String text = scanner.nextLine();
            if (text.equals("null")) continue;
            filters.put(getParameters[j], text);
        }
        System.out.println("Вы выбрали следующие характеристики: " + filters);
        scanner.close();
        // return filters; 
        // }
    
        
    // public static void resultFiltered (Map<String, String> filters, Set<Laptop> laptops) {
        List<Laptop> filtered = new ArrayList<> ();  // формируем новую коллекцию отфильтрованных лаптопов (включаем сюда лаптоп, если подошел под требования в цикле внизу)
    
        for (Laptop laptop : laptops) {  // для каждого лаптопа из коллекции лаптопов... (оставить ли его)
                
            String filterModel = filters.get ("model");   // сохраняем в эту переменную то, что отфильтровываем в поиске
            if (filterModel != null  //  если требование по фильтру есть
                && !filterModel.equals(laptop.getModel())) { // фильтр не прошел
                    continue;  // относится к for
                }
               
            String filterRam = filters.get ("ram");   
            if (filterRam != null   
                && !filterRam.equals(laptop.getRam())) {
                    continue;  
                }    
    
            String filterHardDisk = filters.get ("hardDisk");  
            if (filterHardDisk != null  
                && !filterHardDisk.equals(laptop.getHardDisk())) { 
                    continue;  
                }        
    
            String filterOpSystem = filters.get ("opSystem");   
            if (filterOpSystem != null   
                && !filterOpSystem.equals(laptop.getOpSystem())) { 
                    continue;  
                }        
            
            String filterColor = filters.get ("color");   
            if (filterColor != null    
                && !filterColor.equals(laptop.getColor())) { 
                    continue;  
                }                  
                    
            filtered.add (laptop);        
        }
        System.out.println("По вашим критериям мы подобрали следующие модели: \n" + filtered);   // смотрим результат выбора
    }
}
