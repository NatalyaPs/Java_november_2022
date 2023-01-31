package sem_08_OOP_2.sem_8_1_Weapon_Alexey;

public class Bow extends Weapon {

    public Bow(int magazineSize) {
        super(magazineSize);
    }

    @Override
    public String getName() {
        return "bow";
    }

    @Override
    public int getDamage() {
        return 100;
    }

    @Override
    public int getShootPerMinute() {
        return 1;
    }

    @Override
    public void makeSound() {
        System.out.println("Ba-bah !!!");
        
    }
    
}
