package lec_08_OOP_2.Ex004;

// в консоли видим вызов конструкторов в классах по цепочке (родительский, наследники...)
// можно нажимая на F12 просмотреть как идет по всем конструкторам логика программы

public class Program {
    public static void main(String[] args) {
        // Иерархия вызова конструкторов
        System.out.println("\nDwarf dw1 = new Dwarf()");
        Dwarf dw1 = new Dwarf();

        System.out.println("\nDruid dw2 = new Dwarf();");
        Druid dw2 = new Dwarf();

        System.out.println("\nBaseHero dw3 = new Dwarf();");
        BaseHero dw3 = new Dwarf();
    }    
} 