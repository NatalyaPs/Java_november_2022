package lec_07_OOP_1.Ex006;

import java.util.Random;

// ОБЩАЯ ЛОГИКА ДЛЯ ЛЮБОГО ИЗ ПЕРСОНАЖЕЙ - базовый класс
// =====================================

public class BaseHero {
    protected static int number; // посчет героев
    protected static Random r;

    protected String name;   //имя
    protected int hp;        // запас здоровь
    protected int maxHp;

    static {       // инициализатор статических полей
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }
 
    public BaseHero(String name, int hp) { // конструктор, отвечающий за инициализацию имени и макс.кол-ва здоровья
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() { // конструктор по умолчанию ?
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
        BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() {  // получение информации БЕЗ ДЕТАЛЕЙ (нет манны и элексира)
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }
    
    public void healed(int Hp) {  // лечение
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {   // получение атаки
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}
