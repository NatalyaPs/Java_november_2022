package lec_02;

import java.io.BufferedReader;
import java.io.File;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
import java.io.IOException;
import java.util.logging.*;
import java.io.FileReader;

public class lec_02_ {
    /**
     * 
     */
    public static void main(String[] args) throws IOException {

        // Что такое API для нас: 
        // СТРОКИ
        // ==================================
        // Простой пример
        // Создать строку из 1 млн плюсиков. Как?
        String str = "";                         // если много (изменений?) поиска подстроки и т.п.
        for (int i = 0; i < 10; i++) {   // был 1_000_000
            str += "+";
        }  //  41_000 ms
        //System.out.println(str);

        // быстрый способ: 
        StringBuilder sb = new StringBuilder();   // если много преобразований, изменений 
        for (int j = 0; j < 10; j++) {    // был 1_000_000
            sb.append("+");
        }  // 9 ms
        System.out.println(sb);


        // ВЕСЬ КОД: 
        // ==============
        // public static void time_sek(String[] args) {
        //     var s = System.currentTimeMillis();
        //     //String str = "";
        //     StringBuilder sb = new StringBuilder();
        //     for (int i = 0; i < 1_000_000; i++) {
        //         //str += "+";
        //         sb.append("+");
        //     }
        //     System.out.println(System.currentTimeMillis() - s);       //  проверить время исполнения кода !!!
        //     //System.out.println(str);
        //     //System.out.println(sb);
        // }


        //     СТРОКИ:     (методы)
    //     ========================== 
    // concat(): объединение строк
    // valueOf(): преобразует Object в строковое представление (завязан на toString())
    // join(): объединяет набор строк в одну с учетом разделителя
    // charAt(): получение символа по индексу
    // indexOf(): первый индекс вхождения подстроки
    // lastIndexOf(): последний индекс вхождения подстроки
    // startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
    // replace(): замена одной подстроки на другую
    // trim(): удаляет начальные и конечные пробелы
    // substring(): возвращает подстроку, см.аргументы
    // toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
    // сompareTo(): сравнивает две строки
    // equals(): сравнивает строки с учетом регистра
    // equalsIgnoreCase(): сравнивает строки без учета регистра
    // regionMatches(): сравнивает подстроки в строках
       

        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); // Cергей
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));  // C,е,р,г,е,й


        // РАБОТА С ФАЙЛОВОЙ СИСТЕМОЙ   (каталоги и файлы) (тип File)
        // ======================================================

        File f1 = new File("file.txt");
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

        // в разных системах (линукс, майкрософт) пути у файлов разные.  Значит, надо писать так, ч.б везде открывались:
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
        // /Users/sk/vscode/java_projects/file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt


        // как обрабатывать ошибки с файлами
        // ==================================    
        // try {
        //     Код, в котором может появиться ошибка
        //   } catch (Exception e) {
        //     Обработка, если ошибка случилась
        //   }
        //   finally {
        //     Код, который выполнится в любом случае
        //   }
              
        try {  // файлы. ошибки
            String pathProject1 = System.getProperty("user.dir");
            String pathFile1 = pathProject.concat("/file.txt");
            File f4 = new File(pathFile);
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally { 
            System.out.println("finally"); 
        }
     

        // если можно избежать блока try - catch, то лучше его избежать)
        // еще вриант с if:
        try {  // файлы. ошибки
            String pathProject2 = System.getProperty("user.dir");
            String pathFile2 = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");} 
        finally {
            System.out.println("finally");
        }


        // еще вариант. файлы. ошибки
        String line = "empty";
        try {
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created"); }
            else {
                //BufferedReader bufReader = new BufferedReader(new FileReader(file));  // BufferedReader bufReader = new BufferedReader(new FileReader(file)); - где-то ошибка
                System.out.println("file.existed");
                //line = bufReader.readLine();    // показывает ошибку вверху
                //bufReader.close(); }            // показывает ошибку  
            }   
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);}
    

    //    РАБОТА С ФАЙЛОВОЙ СИСТЕМОЙ:   (методы)
    // =================================
    // isHidden(): возвращает истину, если каталог или файл является скрытым
    // length(): возвращает размер файла в байтах
    // lastModified(): возвращает время последнего изменения файла или каталога
    // list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
    // listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
    // mkdir(): создает новый каталог
    // renameTo(File dest): переименовывает файл или каталог



            // РАБОТА С ПАПКАМИ + - такая же, как и с файлами (не важно, виндовс, линукс...)
        String pathProject5 = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }   

        //  БИНАРНЫЕ ФАЙЛЫ - смотрим прикреленный файл Ex004_bFile.java
        
        
        // ЛОГИРОВАНИЕ
        // =====================================


        //    Использование
        // Logger logger = Logger.getLogger()

        //    Уровни важности
        // INFO, DEBUG, ERROR, WARNING и др.

        //    Вывод
        // ConsoleHandler info = new ConsoleHandler();
        // log.addHandler(info);

        //    Формат вывода: структурированный, абы как*
        // XMLFormatter, SimpleFormatter


    // // смотри файл Ex005_Logger.java
    // // public static void main(String[] args) throws IOException
    //     Logger logger = Logger.getLogger(lec_02_.class.getName()); // созд.переменную типа логер = в гетлогере указываем имя класса, для которого в данном случае мы добавляем логировнаие
    //     // logger.setLevel(Level.INFO);
    //     ConsoleHandler ch = new ConsoleHandler(); // создаем хендлер - здесь КонсольХендлер, значит, все ошибки выпадут в терминал
    //     // FileHandler сh = new FileHandler("log.txt"); // здесь записываем в файл

    //     logger.addHandler(ch); // даем хендлер как аргумент для логера, ч.б. было понятно, куда отправлять сообщения

    //     SimpleFormatter sFormat = new SimpleFormatter();  // создаем фоормат, в рамках которого будем писть сообщения
    //     ch.setFormatter(sFormat);
    //     //или 
    //     XMLFormatter xml = new XMLFormatter();
    //     ch.setFormatter(xml);

    //     // logger.setLevel(Level.INFO);
    //     logger.log(Level.WARNING, "Тестовое логирование 1"); // указывает уровень сообщения и флажок
    //     logger.info("Тестовое логирование 2");  // или пишем сообщение, которое требуется


    }  
}
