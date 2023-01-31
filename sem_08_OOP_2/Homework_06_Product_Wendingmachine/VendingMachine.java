package sem_08_OOP_2.Homework_06_Product_Wendingmachine;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product findProduct (String name, int temperature) {  // найти продукт по его характеристикам (имя, температура)
        for (Product product : products) {
            if (!(product instanceof HotDrinkProduct)) // если не является товаром такого типа
                continue;
            // переменную product приводим к типу HotDrinkProduct
            HotDrinkProduct hotDrink = (HotDrinkProduct) product; // для сокращения условия внизу - ч.б. сделать hotDrink, а не (HotDrinkProduct) product = переменную product приводим к типу HotDrinkProduct

            if (product.getName ().equals (name) && hotDrink.getTemperature () == temperature)  // даункастим // или в этой строке вместо hotDrink вставляем (HotDrinkProduct) product
                return product;
        }
        throw new IllegalStateException("Товар не найден!");
        // return null;
    }
}
