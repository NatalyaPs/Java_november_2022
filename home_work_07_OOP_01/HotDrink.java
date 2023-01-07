package home_work_07_OOP_01;

public class HotDrink extends Goods {
    private int volum;
    private int temperature;

    public HotDrink(String name, float price, int amount, int volum, int temperature) {
        super(name, price, amount);
        this.volum = volum;
        this.temperature = temperature;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + volum;
        result = prime * result + temperature;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        HotDrink other = (HotDrink) obj;
        if (volum != other.volum)
            return false;
        if (temperature != other.temperature)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "HotDrink [" +
                "name='" + name + '\'' +
                ", price=" + price +
                "р. , amount=" + amount +
                ", volum=" + volum + 
                "ml , temperature=" + temperature + "`C]";
    }
}
