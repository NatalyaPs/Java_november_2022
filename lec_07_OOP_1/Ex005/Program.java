package lec_07_OOP_1.Ex005;

// ПРИМЕР БЕЗ НАСЛЕДОВАНИЯ - так делать не надо
// КЛАССЫ ЖРЕЦОВ И МАГОВ ПРАКТИЧЕСКИ КОПИРУЮТ ДРУГ ДРУГА
// ОТЛИЧИЯ ТОЛЬКО В МАННЕ И ЭЛИКСИРЕ
// НАРУШАЕМ ПРИНЦИП DRY 

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());
        
        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

    }
}