// Создайте базовый класс Оружие. У оружия есть название, повреждение, скорострельность, количество зарядов в обойме, звук при выстреле — это методы. Напишите метод, который делает один выстрел.
// Напишите три класса-наследника Оружия. В них переопределите родительские методы.
// Проверьте, как работают все виды оружия.
// Создайте тестовый стенд для оружия — метод, который испытывает одно оружие. У мишени 100 единиц здоровья. Оружие стреляет в него, пока не убьёт.
// Протестируйте все виды оружия на стенде.

package sem_08_OOP_2.sem_8_1_Weapon_Nikita;

import java.util.ArrayList;
import java.util.List;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        List <Weapon> weapons = new ArrayList<>();
        weapons.add(new GunWeapon());
        weapons.add(new MachineGunWeapon());
        weapons.add(new FireGunWeapon());

        for(Weapon weapon : weapons){
            
            System.out.println(weapon.getName());
            defeatTarget(weapon);                        // defeatTarget - поразить цель
            System.out.println("-----------");
        }
        

    }
    private static void defeatTarget(Weapon weapon){   // defeatTarget - поразить цель/мишень
        float health = 100;  // здоровье
        while(health > 0){
            health -= weapon.getDamage();
            System.out.println(weapon.getSound());
            System.out.println(health);
            try {
                Thread.sleep(1000);  // замедление вывода в консоль
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } 
        
    }
}
