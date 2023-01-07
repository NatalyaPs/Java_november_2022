package home_work_07_OOP_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotDrinkWendingMachin extends WendingMachin {

    private Map<Integer, HotDrink> hotDrinkMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public HotDrinkWendingMachin () { } // пустой конструктор
    
    @Override
    public void addProduct(int key, Goods goods) {
        hotDrinkMap.put(key, (HotDrink)goods);
    }
    
    @Override
    public int enterNumber() {
        System.out.print("Введите номер продукта: ");
        int productNumber = scanner.nextInt();
        System.out.println("Покупатель ввел номер: " + productNumber);
        return productNumber;
    }

    @Override
    public HotDrink showGoods(int productNumber) {
        System.out.println("Выбранный продукт: " + hotDrinkMap.get(productNumber));
        return hotDrinkMap.get(productNumber);
    }
    
    @Override
    public void goodsBuy (Goods goods) {
        System.out.println("Внесите деньги для покупки товара: ");
        float deposit = 0f;
        while (true) {
            int cash = scanner.nextInt();
            deposit += cash;
            if (deposit < goods.getPrice()) {
                System.out.printf("Нужно еще %.2f\n", goods.getPrice() - deposit);

            } else if (deposit > goods.getPrice()){
                System.out.printf("Ваша сдача %.2f\n", deposit - goods.getPrice());
                System.out.println("Возьмите ваш товар.");
                getGoods((HotDrink)goods);
                break;
            } else {
                System.out.println("Возьмите ваш товар. Спасибо!");
                getGoods((HotDrink)goods);
                break;
            }
        }
        System.out.println("Спасибо за покупку!!!");
    }

    private void getGoods(HotDrink hotDrink) {
        int amountGoods = hotDrink.getAmount();
        hotDrink.setAmount(amountGoods - 1);
        System.out.println("Остаток товара " + hotDrink.getAmount());
    }
}
