package lec_07_OOP_1.Ex005;


import java.util.Random;

public class Priest {  // жрец
    private static final String HERO_PRIEST_D = "Hero_Priest #%d";
    private static int number; // индекс героев
    private static Random r;  // для случайной величины атаки

    private String name;
    private int hp; // запас здоровья
    private int maxHp;   //макс.зап.здоровья

    private int elixir;  // отличие от мага - эликсир
    private int maxElixir;

    static {
        Priest.number = 0;
        Priest.r = new Random();
    }

    public Priest(String name, int hp, int elixir) {  // конструктор 1
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.elixir = elixir;
        this.maxElixir = elixir;
    }

    public Priest() {  // конструктор 2
        this(String.format(HERO_PRIEST_D, ++Priest.number),
        Priest.r.nextInt(100, 200),
        Priest.r.nextInt(50, 150));
    }

    public int Attack() {
        int damage = Priest.r.nextInt(20, 30);
        this.elixir -= (int)(damage * 0.8);
        if (elixir < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d Elixir:  %d Type: %s",
                this.name, this.hp, this.elixir, this.getClass().getSimpleName());
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
