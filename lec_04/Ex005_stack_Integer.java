package lec_04;

import java.util.Stack;

public class Ex005_stack_Integer {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
/*
ГДЕ-ТО ЕСТЬ НЕБОЛЬШАЯ ОШИБКА  !!!???
 * в стэке сначала умножатся 2*3 и запишется результат 6
 * потом 6 +1 = 7
 * помним! в стэке что пришло в первую очередь, обработано будет в последнюю
 */
    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20  // заготовки других выражений
        // 1 2 3 * 4 * + 10 5 / * 20 -    // заготовки других выражений
        
        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        
        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) { // если число
                st.push(Integer.parseInt(exp[i])); // то добавим
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}