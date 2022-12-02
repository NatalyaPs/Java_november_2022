/* 
В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:

Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. 
*/
package home_work_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class hw_2_3_list_of_studets 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try 
        {
            File stud = new File ("C:/Users/.../home_work_02/hw_2_3_students.txt"); 
            File stud1 = new File ("C:/Users/.../home_work_02/hw_2_3_students1.txt"); 

            br = new BufferedReader(new FileReader(stud));
            bw = new BufferedWriter(new FileWriter(stud1));

            String data;
            String[] data_spl;

            String student = "Студент ";
            String assessment = " получил ";
            String subject = " по предмету ";

            String[]data_spl_new1;
            String[] data_spl_new2;

            StringBuilder sb = new StringBuilder();
            StringBuilder sb_final = new StringBuilder();


            while ((data = br.readLine()) != null) // идем по строке
            {
                data = data.substring(1, data.length()-1); 
                data = data.replaceAll("\\{", ""); 
                data = data.replaceAll("\\}", "");
                
                data_spl = data.split(", "); 
                
                for (int i = 0; i < data_spl.length; i++) 
                {
                    data_spl_new1 = data_spl[i].split(",");

                    for (int j = 0; j < data_spl.length; j++) {
                        data_spl_new2 = data_spl_new1[j].split(":");
                        String key = data_spl_new2[0];
                        key = key.substring(1, key.length() - 1);
                        String value = data_spl_new2[1];
                        value = value.substring(1, value.length() - 1);
                        sb.append(value);
                        sb.append(" ");
                    }
                }
            } 

            String[] strFinal = sb.toString().split(" ");
                        
            for (int i = 0; i < strFinal.length; i += 3) {
                sb_final.append(String.format("%s", student));
                sb_final.append(String.format("%s", strFinal[i]));
                sb_final.append(String.format("%s", assessment));
                sb_final.append(String.format("%s", strFinal[i+1]));
                sb_final.append(String.format("%s", subject));
                sb_final.append(String.format("%s", strFinal[i+2]));
                sb_final.append("." + "\n");
            }
            bw.write(sb_final + "\n");
        }
         
        catch(Exception e) 
        {
            e.printStackTrace();
        }
        finally {
            try {
                if(br != null)
                   br.close();
             } catch (Exception e) {  // catch (IOException e)
                System.out.println("Ошибка чтения файла");
             }
             try {
                if(bw != null)
                   bw.close();
             } catch (Exception e) {  // catch (IOException e)
                System.out.println("Ошибка записи файла");
             }
        }
    }
}
    
