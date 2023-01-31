package sem_08_OOP_2.sem_8_1_Weapon_Nikita;

public class FireGunWeapon extends Weapon {  // огнестрельное оружение (???)



    @Override
    public String getName() {
        return "Fire Gun";
    }

    @Override
    public float getDamage() {
        return 200;
    }

    @Override
    public float rateOfFire() {
        return 500;
    }

    @Override
    public int bulletsAmount() {
        return 500;
    }

    @Override
    public String getSound() {
        return "fire sound";
    }

    @Override
    public String toString() {
        return "FireGunWeapon []";
    }
    
}
