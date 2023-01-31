package sem_08_OOP_2.sem_8_1_Weapon_Alexey;

public abstract class Weapon {

    private int magazineSize;  // размер магазина

    private int magazineCurrent;  // текущий магазин  

    public Weapon(int magazineSize) {
        this.magazineSize = magazineSize;
        this.magazineCurrent = magazineSize;  
    }

    public abstract String getName();

    public abstract int getDamage();

    public abstract int getShootPerMinute();

//    public int getMagazineSize() {   // вроде нигде не используется
//        return magazineSize;
//    }

//    public int getMagazineCurrent() {  // вроде нигде не используется
//        return magazineCurrent;
//    }


    public abstract void makeSound();  // создает звук

    public void getShoot() {  // сделать выстрел
        makeSound();
        magazineCurrent -= 1;
    }

}
