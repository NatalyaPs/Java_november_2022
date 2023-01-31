package lec_09_OOP_3.Ex007;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));

        for (var ingredient : latte) {
            System.err.println(ingredient);        // добавит только 1 раз воду, т.к. метод addComponent в Напитке атк прописан
        }
    }
}
