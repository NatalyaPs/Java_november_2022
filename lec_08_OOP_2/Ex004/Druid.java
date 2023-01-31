package lec_08_OOP_2.Ex004;

public class Druid extends BaseHero {

    // конструктор с 2мя аргументами, к-й вызывает конструктор базового класса.  Можем добавлять дополнительные поля
    public Druid(String name, int hp) {
        super(name, hp);
        System.out.println("Вызван Druid(String name, int hp)");

    }

    public Druid() {
        this("", 0);
        // super("", 0);
        System.out.println("Вызван Druid()");
    }
}