package home_work_07_OOP_01;

// import java.util.List;

abstract public class WendingMachin {

    public abstract int enterNumber();

    public abstract Goods showGoods(int productNumber);

    public abstract void goodsBuy(Goods goods); // покупка товара

    public abstract void addProduct(int key, Goods goods);
}
