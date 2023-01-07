package sem_06_task_2_a_cat;

public class Task2_cat {
    public static void main(String[] args) {
        Cat cat = new Cat ("Барсик", "Иван Иванович", "дворянин", 4f);

        System.out.println(cat.getName ()); // нужны геттеры и сеттеры в Cat
        cat.setName ("Мурчик");
        System.out.println(cat);
    }
}
