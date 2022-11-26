package lec_02;

public class Ex000_lecture {
    public static void main(String[] args) {

        // Что такое API для нас: строки
        // Простой пример
        // Создать строку из 1 млн плюсиков. Как?
        String str = "";                       // если много изменений
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }  //  41_000 ms
        System.out.println(str);

        // быстрый способ: 
        StringBuilder sb = new StringBuilder();  // если много преобразований
        for (int j = 0; j < 1_000_000; j++) {
            sb.append("+");
        }  // 9 ms
        System.out.println(sb);


        // ВЕСЬ КОД: 
        // public static void time_sek(String[] args) {
        //     var s = System.currentTimeMillis();
        //     //String str = "";
        //     StringBuilder sb = new StringBuilder();
        //     for (int i = 0; i < 1_000_000; i++) {
        //         //str += "+";
        //         sb.append("+");
        //     }
        //     System.out.println(System.currentTimeMillis() - s);
        //     //System.out.println(str);
        //     //System.out.println(sb);
        // }
     
        // СТРОКИ:
        // ========================== 
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
    


}}
