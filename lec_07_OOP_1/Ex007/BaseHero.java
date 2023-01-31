package lec_07_OOP_1.Ex007;

import java.util.Random;
 
public class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() {
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    //перенесли метод атаки в базовый метод. В предыдущем примере Атака была описана в производных классах
    public void Attack(BaseHero target) {    // аргумент - переменная базового типа // target - цель
        int damage = BaseHero.r.nextInt(10, 20);  // случайное число урона
        target.GetDamage(damage);  // передаем нашей target) целt в кач-ве аргумента метода getDamage
    }
}
