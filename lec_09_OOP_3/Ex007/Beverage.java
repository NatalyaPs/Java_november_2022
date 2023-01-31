package lec_09_OOP_3.Ex007;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage  implements Iterable<Ingredient> {    // напиток
    public List<Ingredient> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component) {

        if (!(components.indexOf(component) != -1))  // если компонента нет, то добавим
            components.add(component);
    }

}