package sem_06_task_2_b_cat;

import java.time.LocalDate;
import java.time.Month;


// import sem_06_task_2_b_cat.Award;
// import sem_06_task_2_b_cat.Cat_alex;


/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
public class Task2_cat_2 {
    public static void main(String[] args) {
        Cat_alex tom = new Cat_alex("Tom", "Home", "Blue", LocalDate.of(2020, Month.AUGUST, 9), "Denis");
        tom.addAward(new Award("Best color", "1st", 2022));
        tom.addAward(new Award("Best cat", "2st", 2022));
        System.out.println(tom);

        Cat_alex barsik = new Cat_alex("Barsik", "Siberian Cat", "Grey", LocalDate.of(2020, Month.MAY, 9), "Alex");
        barsik.addAward(new Award("Континентальный чемпион", "1st", 2023));
        barsik.addAward(new Award("Гранд чемпион", "1st", 2023));
        System.out.println(barsik);


        System.out.println("====================================================");

        KuklachevCat cat1 = new KuklachevCat("Мурзик", "Сибирская", "Серо-голобуй", LocalDate.of(2019, Month.JANUARY, 7));
        cat1.addTrick(new Action("Кататься на велосипеде", "Юрий"));

        KuklachevCat cat2 = new KuklachevCat("Павел Иванович", "Мэйнкун", "Рыжий", LocalDate.of(2018, Month.APRIL, 7));
        cat2.addTrick(new Action("Ходить на передних лапах", "Юрий"));

        System.out.println(cat1);
        System.out.println(cat2);

    }
}
