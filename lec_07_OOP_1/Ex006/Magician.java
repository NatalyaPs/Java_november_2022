package lec_07_OOP_1.Ex006;

/**
 * extends - означает, что класс Magician является наследником(или производным) класса BaseHero
 */
public class Magician extends BaseHero {

    private int mana;   // отличия от базового класса
    private int maxMana;

    public Magician() {
        // super- значит обращаемся к конструктору базового класса (родительского - BaseHero)
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(50, 150);  // делаем доинициализацию
        this.mana = maxMana;  // this - значит обращаемся в текущем классе
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    // этот метод немного отличается от базового getInfo тем, что добавляет информацию о "mana"
    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}