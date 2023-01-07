package lec_07_OOP_1.Ex005;

import java.util.Random;

public class Magician {  //маг
    private static int number;  // индекс героев
    private static Random r;   // для случайной величины атаки

    private String name;
    private int hp;    // запас здоровья
    private int maxHp;   // максимальный запас здоровья

    private int mana;  // отличие от жреца
    private int maxMana;

    static {
        Magician.number = 0;
        Magician.r = new Random();
    }

    public Magician(String name, int hp, int mana) { // конструктор 1
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.maxMana = mana;
    }

    public Magician() { // конструктор 2
        this(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200),
                Magician.r.nextInt(50, 150));
    }

    public int Attack() { // метод атаки
        int damage = Magician.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {  // получение информации
        return String.format("Name: %s  Hp: %d Enegry:  %d Type: %s",
                this.name, this.hp, this.mana, this.getClass().getSimpleName());
    }
    
    public void healed(int Hp) {  // лечение
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {  // ущерб
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}