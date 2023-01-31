package sem_08_OOP_2.Homework_06_Product_Wendingmachine;

public class HotDrinkProduct extends Product{
    
    int temperature;

    public HotDrinkProduct(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrinkProduct [name=" + getName () + 
                ", temperature=" + temperature + "]";
    }

   
}
