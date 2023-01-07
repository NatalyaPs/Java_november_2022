package sem_07_OOP_1;

public class Laptop {
    private String producer;
    private String model;
    
    public Laptop(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Laptop [producer=" + producer + ", model=" + model + "]";
    }
}
