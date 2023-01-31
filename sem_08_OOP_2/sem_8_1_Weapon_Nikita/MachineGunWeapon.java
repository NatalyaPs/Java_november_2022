package sem_08_OOP_2.sem_8_1_Weapon_Nikita;
public class MachineGunWeapon extends Weapon {   // пулемет

    @Override
    public String getName() {
        return "AK47";
    }

    @Override
    public float getDamage() {
        return 100;
    }

    @Override
    public float rateOfFire() {
        return 50;
    }

    @Override
    public int bulletsAmount() {
        return 50;
    }

    @Override
    public String getSound() {
        return "bang-bang";
    }

    @Override
    public String toString() {
        return "MachineGunWeapon []";
    }
    
}
