package lec_09_OOP_3.Ex004.ExBeverage;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage implements Iterable<Ingredient> {   // напиток имплементирует интурфейс Итератор
    public List<Ingredient> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){   // здесь может добавлять одинаковые компоненты
        components.add(component);
    }

    // ЗДЕСЬ НЕ ДОБАВИЛИ МЕТОДЫ ДЛЯ ИТЕРАТОРА В РОДИТЕЛЬСКОМ КЛАССЕ
}