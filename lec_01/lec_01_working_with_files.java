package lec_01;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * РАБОТА С ФАЙЛАМИ
============================
 */
public class lec_01_working_with_files {

    public static void main(String[] args) {
    //public static void main_fale(String[] args) 
        
    // СОЗДАНИЕ И ЗАПИСЬ/ДОЗАПИСЬ
    //--------------------------
    // import java.io.FileWriter;
    // import java.io.IOException;
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } 
       
    // ЧТЕНИЕ,  ВАРИАНТ ПОСИМВОЛЬНО
    //-----------------------------------
    // import java.io.*;
        
    public static void main_SIMBOL(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
        fr.close();
    } 

    // ЧТЕНИЕ,  ВАРИАНТ ПОСТРОЧНО
    //-----------------------------------
    // import java.io.*;
        
    public static void main_st(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close(); 
    }    
}
