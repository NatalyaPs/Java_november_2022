// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

package sem_05;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class sem_5_1_breckets{
    public static void main(String[] args) {
        String a = "a+(d*3)";
        String b = "[a+(1*3)";
        String c = "[6+(3*3)]";
        String d = "{a}[+]{(d*3)}";
        String e = "<{a}+{(d*3)}>";
        String f = "{a+]}{(d*3)}";
        System.out.println(placement(a));
    }
    
    public static boolean placement (String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> dictionary = new HashMap();
        dictionary.put('(', ')');
        dictionary.put('[', ']');
        dictionary.put('{', '}');
        dictionary.put('<', '>');

        for (int i = 0; i < str.length(); i++) {
            if (dictionary.containsKey(str.charAt(i))) // "если true" - мы проверили, что символ является открывающей скобкой
                stack.addFirst(str.charAt(i));

            if (dictionary.containsValue(str.charAt(i))) {
                Character openBrecket = stack.removeFirst();
                if(!dictionary.get(openBrecket).equals(str.charAt(i)))
                    return false;
            }
        }
        if (stack.isEmpty()) // если стэк пустой
            return true;
        else
            return false;
    }
}