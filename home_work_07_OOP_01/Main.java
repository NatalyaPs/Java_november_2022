/* При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.
В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.*/

// НА ОСНОВЕ РАБОТЫ НА СЕМИНАРЕ №7 (1 ООП)
// -------------------------------
// ДОБАВЛЕНЫ КЛАССЫ:
// - HotDrink ( поля:  + объем, + температура )
// - HotDrinkWendingMachin

package home_work_07_OOP_01;

public class Main {
    
    public static void main(String[] args) {
        // работа на семинаре:
        // VkusVillWendingMachin  vkusVillWM = new VkusVillWendingMachin();
        // vkusVillWM.addProduct(1, new Goods("Lays", 49, 20));
        // vkusVillWM.addProduct(2, new Goods("Cola", 299, 1));
        // vkusVillWM.addProduct(3, new Goods("Lipton", 99, 10));
        // vkusVillWM.addProduct(4, new Goods("Milka", 1150, 5));
        
        // int number = vkusVillWM.enterNumber();
        // Goods goods = vkusVillWM.showGoods(number);
        // vkusVillWM.goodsBuy(goods);

        HotDrinkWendingMachin hotDrinkWM = new HotDrinkWendingMachin();

        hotDrinkWM.addProduct(5, new HotDrink("кофе натуральный", 70, 100, 150, 45));
        hotDrinkWM.addProduct(6, new HotDrink("чай зеленый", 50, 80, 200, 70));
        hotDrinkWM.addProduct(7, new HotDrink("чай черный", 50, 90, 200, 65));
        
        int input = hotDrinkWM.enterNumber();
        HotDrink hotDrink = hotDrinkWM.showGoods(input);
        hotDrinkWM.goodsBuy(hotDrink);
    }
}
