/*
1.	В файле содержится строка с исходными данными в такой форме(json): 
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. 
Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
*/

package home_work_02;
import java.io.BufferedReader;  // для больших файлов.
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class hw_2_1_string_json_SQL {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try 
        {
            File stud = new File ("C:/Users/.../home_work_02/hw_2_1_students.txt"); // hw_2_1_students_json.json
            File stud1 = new File ("C:/Users/.../home_work_02/hw_2_1_students1.txt"); // hw_2_1_students_sql.sql

            br = new BufferedReader(new FileReader(stud));
            bw = new BufferedWriter(new FileWriter(stud1));
            

            String data;
            String[] data_new; // для разделения строки ", "
            String[] data_key; // для разделения пар ":"
            String select = "SELECT * FROM students WHERE "; // начало строки в sql
            StringBuilder sb = new StringBuilder();
            StringBuilder sb_key = new StringBuilder();
            String sNull = "null";
            while ((data = br.readLine()) != null) // идем по строке // или != -1 если посимвольно
            { 
                data = data.substring(1, data.length() - 1); // удаляем 1й и крайний символ из строки {}
                data_new = data.split(", ");
                sb.append(String.format("%s", select));
                for (int i = 0; i < data_new.length; i++) {
                // for (String dn : data_new) {
                //     data_key = dn.split(":");
                    data_key = data_new[i].split(":");
                    if (data_key[1].substring(1, data_key[1].length()-1).equals(sNull)){
                        continue;
                    }
                    else{
                        String key = data_key[0];
                        key = key.substring(1, key.length()-1); // убираем "" первого слова
                        String value = data_key[1];
                        // if (value.equals(sNull)) continue;
                        sb_key.append(String.format(" AND %s = %s", key, value));
                    }
                }
                String result = sb_key.toString();
                result = result.substring(5); // убираем символы (AND ) перед name
                sb.append(String.format("%s", result));
                bw.write(sb + "\n");
            }
        }    
        catch(Exception e) {
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