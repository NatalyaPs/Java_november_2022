package sem_08_OOP_2.Homework_06_Product_Wendingmachine;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + "]";
    }

    
}
