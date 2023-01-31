package lec_09_OOP_3.Ex004.ExBeverage;

import java.util.Iterator;

public class CoffeeBeverage extends Beverage {

    @Override
    public Iterator<Ingredient> iterator() {  // переопределение Итератора из родительского класса под себя

        Iterator<Ingredient> it = new Iterator<Ingredient>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingredient next() {
                return components.get(index++);
            }

        };
        return it;

    }

}
