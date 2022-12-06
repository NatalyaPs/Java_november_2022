/*Задание №0
Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */


package sem_03;

public class sem03_0_equals_string {
    public static void main(String[] args) {

        // if(a == b) - равенство ССЫЛОК
        // if (a.equals(b)) - равенство ЗНАЧЕНИЙ

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        // рассмотрим равенство ссылок:
        System.out.println(s1 == s2); // true - это 2 разных объекта, 
        //но поскольку они одинковые,java одинаковые строкидля экономии места
        //создает 1строку,а переменные направляет туда. Для константных строк
        System.out.println(s1 == s3); //true - здесь присваивание, т.е 2 переменные ведут к одному объекту
        System.out.println(s1 == s4); // true- конкатенация - складываем строки и получаем новую строку. 
        //Сумму константных строк компилятор посчитал зараннее. 
        //он ее прочитал раньше и понял, что строка "hello" уже есть и поэтому не стал ее записывал, 
        //а сделал ссылку на такую же строку
        System.out.println(s1 == s5); // false, т.к. new => s5- это новый объект. Здесь будут разные ссылки
        System.out.println(s1 == s6); // false, т.к. new - новый объект

        System.out.println(s1 == s6); // false, т.к. new - оба новые объекты

        if(s5 == "hello"){}
        // верно ли, что s5 == "hello" // false - т.к. это логическая ошибка, строки так не сравнивают
        // для сравнения строк используется equals

        System.out.println(s1.equals(s5)); // true
        // в этом примере будет true для сравнивания значения всех переменных s
        // регистр имеет значение (таблица Аски)

        System.out.println(s1.equalsIgnoreCase(s5)); // сравнивает любой регистр , н-р "HeLlo"

        }
    
}
