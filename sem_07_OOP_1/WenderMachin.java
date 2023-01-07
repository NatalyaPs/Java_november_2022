package sem_07_OOP_1;

// import java.util.List;

abstract public class WenderMachin {

    public abstract int enterNumber();  // порядковый номер (товара)

    public abstract Goods showGoods(int productNumber);  // показать товар

    public abstract void goodsBuy(Goods goods);  // покупка товара


}
