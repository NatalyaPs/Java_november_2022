package home_work_07_OOP_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VkusVillWendingMachin extends WendingMachin {

    private Map<Integer, Goods> productsMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public VkusVillWendingMachin() {
    }

    public void addProduct(int key, Goods goods) {
        productsMap.put(key, goods);
    }

    @Override
    public int enterNumber() {
        System.out.print("Введите номер продукта: ");
        int productNumber = scanner.nextInt();
        System.out.println("Покупатель ввел номер " + productNumber);
        return productNumber;
    }

    @Override
    public Goods showGoods(int productNumber) {
        System.out.println("Выбранный продукт: " + productsMap.get(productNumber));
        return productsMap.get(productNumber);
    }

    @Override
    public void goodsBuy(Goods goods) {
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
                getGoods(goods);
                break;
            } else {
                System.out.println("Возьмите ваш товар. Спасибо!");
                getGoods(goods);
                break;
            }
        }
        System.out.println("Спасибо за покупку!!!");
    }

    private void getGoods(Goods goods) {
        int amountGoods = goods.getAmount();
        goods.setAmount(amountGoods - 1);
        System.out.println("Количество товара " + goods.getAmount());
    }
}
