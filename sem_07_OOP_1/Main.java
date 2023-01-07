package sem_07_OOP_1;

/* комментарий Ярослава: 
 * это хороший мэйн, здесь заполняется товар и вызываются методы, которые сокрыты от пользователя
 * так выглядит высокоуровневая программа
*/
public class Main {
    public static void main(String[] args) {
        VkusVillWenderMachin VVwenderMachin = new VkusVillWenderMachin();
        VVwenderMachin.addProduct(1, new Goods("Lays", 12345, 49, 20));
        VVwenderMachin.addProduct(2, new Goods("Cola", 11111, 299, 1));
        VVwenderMachin.addProduct(3, new Goods("Lipton", 22222, 99, 10));
        VVwenderMachin.addProduct(4, new Goods("Milka", 15643, 150, 5));

        int number = VVwenderMachin.enterNumber();
        Goods goods = VVwenderMachin.showGoods(number);
        VVwenderMachin.goodsBuy(goods);
    }
}
