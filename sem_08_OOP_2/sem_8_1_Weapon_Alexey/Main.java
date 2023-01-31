// Создайте базовый класс Оружие. У оружия есть название, повреждение, скорострельность, количество зарядов в обойме, звук при выстреле — это методы. Напишите метод, который делает один выстрел.
// Напишите три класса-наследника Оружия. В них переопределите родительские методы.
// Проверьте, как работают все виды оружия.
// Создайте тестовый стенд для оружия — метод, который испытывает одно оружие. У мишени 100 единиц здоровья. Оружие стреляет в него, пока не убьёт.
// Протестируйте все виды оружия на стенде.

package sem_08_OOP_2.sem_8_1_Weapon_Alexey;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    private static void killTarget (int hp, Weapon weapon) throws InterruptedException { // уничтожить мишень (здоровье 100, оружие)
        while (hp > 0) {
            weapon.getShoot();
            hp -= weapon.getDamage();
            System.out.printf("hp:  %d\n", hp);
            Thread.sleep(60 / weapon.getShootPerMinute() * 100);
        }
    }

    public static void main(String[] args) {
        
        List<Weapon> list = new ArrayList<>();
        list.add (new PistolWeapon(7));
        list.add (new MachineGun(21));
        list.add (new Bow(1));

        for (Weapon weapon : list) {
            try {
                killTarget(100, weapon);
                System.out.println();   
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}
