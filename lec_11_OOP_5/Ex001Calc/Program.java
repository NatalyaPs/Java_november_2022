/*Написать программу сложения двух чисел.
Почти как раньше, но лучше! */

package Ex001Calc;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

        // var m = new SumModel();
        // var n = new View();
        // Presenter p1 = new Presenter(m, n);
        // p1.buttonClick();
    }
}
