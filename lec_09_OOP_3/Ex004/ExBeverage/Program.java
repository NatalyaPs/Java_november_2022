package lec_09_OOP_3.Ex004.ExBeverage;

// import lec_09_OOP_3.Ex004.ExBeverage.*;

// три вода
public class Program {
    public static void main(String[] args) {
        CoffeeBeverage latte = new CoffeeBeverage();
        latte.addComponent(new WaterIngredient("вода"));
        latte.addComponent(new WaterIngredient("вода"));
        latte.addComponent(new WaterIngredient("вода"));

        for (var ingredient : latte) {   // здесь получилось пройти по коллекции циклом фор-ич (см. пример 2)
            System.err.println(ingredient);
        }
    }
}
