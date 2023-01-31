package sem_08_OOP_2.sem_8_1_Weapon_Nikita;
/*class Создайте базовый класс Оружие. У оружия есть название, повреждение, скорострельность, 
количество зарядов в обойме, звук при выстреле — это методы. Напишите метод, который делает один выстрел.
Напишите три класса-наследника Оружия. В них переопределите родительские методы.
Проверьте, как работают оба оружия.
 */

public abstract class Weapon {


    public abstract String getName();
    public abstract float getDamage();  // получение урона
    public abstract float rateOfFire();  // скорострельность
    public abstract int bulletsAmount();  // количество пуль
    public abstract String getSound();  // получ.звук


}
