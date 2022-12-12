// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
package sem_01;

import java.time.LocalDateTime; 
import java.util.Scanner;  

public class task_1_time_name {     
    public static void main(String[] args)     {        
        Scanner iScanner = new Scanner(System.in, "CP866");        
        System.out.printf("name: ");        
        String name = iScanner.nextLine();         
        LocalDateTime now = LocalDateTime.now ();                
        if (now.getHour() < 12 &&  now.getHour() >= 5){             
            System.out.printf("Доброе утро, %s!", name);}
        else if(now.getHour() < 18 &&  now.getHour() >= 12){
            System.out.printf("Добрый день, %s!", name);}        
        else if(now.getHour() < 23 &&  now.getHour() >= 18){
            System.out.printf("Добрый вечер, %s!", name);} 
        else if(now.getHour() < 5){
            System.out.printf("Доброй ночи, %s!", name);}
        iScanner.close();      
} }

