package sem_08_OOP_2.Weapon_Alexey;

public class PistolWeapon extends Weapon {

    public PistolWeapon(int magazineSize) {
        super(magazineSize);
    }
    @Override
    public String getName() {
        return "Disert Eagle";
    }

    @Override
    public int getDamage() {
        return 12;
    }

    @Override
    public int getShootPerMinute() {
        return 30;
    }

    @Override
    public void makeSound() {
        System.out.println("Bang!!!");
    }

}
