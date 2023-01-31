package sem_08_OOP_2.sem_8_1_Weapon_Nikita;
public class GunWeapon extends Weapon {  // пистолет

    @Override
    public String getName() {
        return "Eagle";
    }

    @Override
    public float getDamage() {
        return 10;
    }

    @Override
    public float rateOfFire() {
        return 15;
    }

    @Override
    public int bulletsAmount() {
        return 10;
    }

    @Override
    public String getSound() {
        return "bang";
    }

    @Override
    public String toString() {
        return "GunWeapon []";
    }
    
}
