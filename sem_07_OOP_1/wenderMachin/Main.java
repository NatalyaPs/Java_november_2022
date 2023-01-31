package sem_07_OOP_1.wenderMachin;

/* комментарий Ярослава: 
 * это хороший мэйн, здесь заполняется товар и вызываются методы, которые сокрыты от пользователя
 * так выглядит высокоуровневая программа
*/
public class Main {
    public static void main(String[] args) {
        VkusVillWenderMachin vkusVillWM = new VkusVillWenderMachin();
        vkusVillWM.addProduct(1, new Goods("Lays", 12345, 49, 20));
        vkusVillWM.addProduct(2, new Goods("Cola", 11111, 299, 1));
        vkusVillWM.addProduct(3, new Goods("Lipton", 22222, 99, 10));
        vkusVillWM.addProduct(4, new Goods("Milka", 15643, 150, 5));

        int number = vkusVillWM.enterNumber();
        Goods goods = vkusVillWM.showGoods(number);
        vkusVillWM.goodsBuy(goods);
    }
}
