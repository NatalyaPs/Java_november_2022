package sem_02;
// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//  который запишет эту строку в простой текстовый файл, 
// обработайте исключения.
//import java.io.File;
public class sem02_4_test100 {
    public static void main(String[] args) {
        System.out.println (composeString(100));
    }
    public static String composeString (int n){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++){
                res.append("TEST");
        }
    return res.toString();
    }
    public static void FileWrite (){

    }
}


//     public static void main(String[] args) {
//         String line = "empty";
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file.txt");
//             File file = new File(pathFile);

//             if (file.createNewFile()) {
//                 System.out.println("file.created");
//             }
//             else {
//                 System.out.println("file.existed");
//                 FileWriter fileWriter = new FileWriter(file, true);
//                 fileWriter.write("new line");
