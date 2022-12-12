// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

//код Юрия
package sem_05;

// import java.util.HashMap;

// public class sem_5_1_isIsomorph_2 {
//     public static void main(String[] args) {
//         printResult("add", "egg");
//         printResult("bar", "foo");
//         printResult("paper", "title");
//     }

//     static boolean areStringisIsomorph (String word1, String word2){
//         HashMap <Character, Character> map = new HashMap<>();

//         if (word1.length() != word2.length()){
//             return false;
//         }


//         for (int i = 0; i < word1.length(); i++) {
//             if (letterToLetter.containsKey(word1.charAt(i))){
//                 if (letterToLetter.get(word1.charAt(i)) != word2.charAt(i)){
//                     return false;
//                 }
//             else{
//                 letterToLetter.put(word1.charAt(i), word2.charAt(i));
//             }
//             }
//         }
//         return true;
//     }

//     static void printResult (String word1, String word2){
//         System.out.println(String.format(%s, %s, %s, word1, word2, areStringisIsomorph(word1, word2) ? "true" : "false"));
//     }

// }

