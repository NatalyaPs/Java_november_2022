package METHODS;

import java.util.Scanner;

public class scanner {
    public static String scannerText(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String text = iScanner.nextLine();
        iScanner.close();
        return text;
    }

    public static void main(String[] args) {
        scannerText(args);
    }
}
