package sem_08_OOP_2.Weapon_Nikita;

public class FireGunWeapon extends Weapon {



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
    public Integer bulletsAmount() {
       
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
