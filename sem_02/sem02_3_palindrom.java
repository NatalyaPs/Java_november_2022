// Напишите метод, который принимает на вход строку 
// (String) и определяет является ли строка палиндромом (возвращает boolean значение).
package sem_02;

public class sem02_3_palindrom {
    public static void main(String[] args) {
        String s = "abcddcba1";
        String res = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(res));
    }
}


// 8 строка заменяет код ниже!!!!!!!!!!!!!
//         if (s.equals(res)){
//             System.out.println("true");
//             // System.out.print(q);
//         }
//         else{
//             q = false;
//             System.out.print("false");
//         }   
//     }
// }
    