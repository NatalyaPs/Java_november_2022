package home_work_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Search {
    
    }
// System.out.println(laptops);

        // // сохраняем пожелания пользователя в Мар
        // Map<String, String> filters = new HashMap<> ();  //  <String - требование, String - значение фильтра - если нет требования пользователя, то кладем сюда null>

        // Scanner scanner = new Scanner (System.in);
        // String[] parameters = {"модель: Samsung, Aser, Apple или null", 
        //                         "оперативная память: 16, 32, 64 или null", 
        //                         "жесткий диск: 300, 500, 1000 или null", 
        //                         "операционная система: Windows, Linux, macOS или null", 
        //                         "цвет: black, white, grey или null"};
       
        // String[] getParameters = {"model", "rem", "hardDisk", "opSystem", "color"};                         

        // System.out.println("Заполните поля для выбора подходящей модели: ");
        // for (int j = 0; j < getParameters.length; j++) {
        //     System.out.println(parameters[j]);
        //     filters.put(getParameters[j], scanner.nextLine());
        // }
        // System.out.println(filters);
        // scanner.close();

        
        // List<Laptop> filtered = new ArrayList<> ();  // формируем новую коллекцию отфильтрованных лаптопов (включаем сюда лаптоп, если подошел под требования в цикле внизу)

        // for (Laptop laptop : laptops) {  // для каждого лаптопа из коллекции лаптопов... (оставить ли его)
            
        //     String filterModel = filters.get ("model");   // сохраняем в эту переменную то, что отфильтровываем в поиске
        //     if (filterModel != null  //  если требования по фильтру есть
        //         && !filterModel.equals(laptop.getModel())) { // фильтр не прошел
        //             continue;  // относится к for
        //         }
           
        //     String filterRam = filters.get ("ram");   // сохраняем в эту переменную то, что отфильтровываем в поиске
        //     if (filterRam != null  //  если требования по фильтру есть
        //         && !filterRam.equals(laptop.getRam())) { // фильтр не прошел
        //             continue;  // относится к for
        //         }    

        //     String filterHardDisk = filters.get ("hardDisk");   // сохраняем в эту переменную то, что отфильтровываем в поиске
        //     if (filterHardDisk != null  //  если требования по фильтру есть
        //         && !filterHardDisk.equals(laptop.getHardDisk())) { // фильтр не прошел
        //             continue;  // относится к for
        //         }        

        //     String filterOpSystem = filters.get ("opSystem");   // сохраняем в эту переменную то, что отфильтровываем в поиске
        //     if (filterOpSystem != null  //  если требования по фильтру есть
        //         && !filterOpSystem.equals(laptop.getOpSystem())) { // фильтр не прошел
        //             continue;  // относится к for
        //         }        
                   

        //     String filterColor = filters.get ("color");   // сохраняем в эту переменную то, что отфильтровываем в поиске
        //     if (filterColor != null  //  если требования по фильтру есть
        //         && !filterColor.equals(laptop.getColor())) { // фильтр не прошел
        //             continue;  // относится к for
        //         }                  
                
        //     filtered.add (laptop);        
        // }
        // if (filtered.size() == 0) {
        //     System.out.println("По вашему запросу ничего не найдено.\nПодберите другие критерии поиска.");
        // }
        // else {
        //     System.out.println("По вашим критериям мы подобрали следующие модели: \n" + filtered);   // смотрим результат выбора
        // }