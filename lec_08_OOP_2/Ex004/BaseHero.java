package lec_08_OOP_2.Ex004;

public abstract class BaseHero {

    public BaseHero(String name, int hp) {  // консруктор с 2мя аргументами, к-й вызывается конструктором по умолчанию
        System.out.println("Вызван BaseHero(String name, int hp)");
    }

    public BaseHero() {  // конструкор по умолчанию
        this("", 0);
        System.out.println("Вызван BaseHero()");
    }
}