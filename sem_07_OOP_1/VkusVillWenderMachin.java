package sem_07_OOP_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VkusVillWenderMachin extends WenderMachin {

    private Map<Integer, Goods> productsMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public VkusVillWenderMachin() {  // пустой конструктор, т.к. Мар неудобно здесь заполнять
    }                                  // поэтому функция ниже (addProduct), что б заполнять мар

    public void addProduct(int key, Goods goods) {  //типично void для этой функции
        productsMap.put(key, goods);
    }

    @Override
    public int enterNumber() {   // выбрать товар по номеру (по ключу в Мар)
        System.out.print("Введите номер товара: ");
        int productNumber = scanner.nextInt();
        System.out.println("Покупатель ввел номер " + productNumber);
        return productNumber;
    }

    @Override
    public Goods showGoods(int productNumber) {  // показать товар
        System.out.println("Выбранный продукт: " + productsMap.get(productNumber));
        return productsMap.get(productNumber);  // выбираем товар по ключу в Мар
    }

    @Override
    public void goodsBuy(Goods goods) {   // покупка товаров
        System.out.println("Внесите деньги для покупки товара: ");
        float deposit = 0f;
        while (true) {
            int cash = scanner.nextInt();
            deposit += cash;
            if (deposit < goods.getPrice()) {
                System.out.printf("Нужно еще %.2f\n", goods.getPrice() - deposit);

            } else if (deposit > goods.getPrice()){
                System.out.printf("Ваша сдача %.2f\n", deposit - goods.getPrice());
                System.out.println("Возьмите ваш товар");
                getGoods(goods);
                break;
            } else {
                System.out.println("Возьмите ваш товар.");
                getGoods(goods);
                break;
            }
        }
        System.out.println("Спасибо за покупку!!!");
    }

    private void getGoods(Goods goods) {  // уменьшение остатка в аппарате после покупки
        int amountGoods = goods.getAmount();  // сколько было товара кладем в переменную
        goods.setAmount(amountGoods - 1);  // уменьшаем на 1
        System.out.println("Остаток товара в аппарате: " + goods.getAmount());
    }
}
