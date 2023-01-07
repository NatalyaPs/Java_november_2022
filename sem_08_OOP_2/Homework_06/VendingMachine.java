package sem_08_OOP_2.Homework_06;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product findProduct (String name, int temperature) {
        for (Product product : products) {
            if (!(product instanceof HotDrinkProduct))
                continue;

            HotDrinkProduct hotDrink = (HotDrinkProduct) product;

            if (product.getName ().equals (name) && hotDrink.getTemperature () == temperature)
                return product;
        }
        throw new IllegalStateException("Товар не найден!");
        // return null;
    }
}
