package METHODS;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

class Homework {
    public static void main(String[] args) {
        int[] numbers = { 5, 1, 2, 3 };
        eachOtherSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void eachOtherSort (int[] numbers) {
        Logger logger = Logger.getLogger(Homework.class.getName ());

        for (int i = 0; i < numbers.length; i++) {
            logger.log (Level.INFO, String.format ("i = %d", i));
            for (int j = 0; j < numbers.length; j++) {
                logger.log (Level.INFO, String.format ("j = %d", j));
                logger.log (Level.INFO, String.format ("need to swap? = %d", i < j && numbers[i] > numbers[j] ? 1 : 0));
                if (i < j && numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    logger.log (Level.INFO, Arrays.toString(numbers));
                }
            }
        }
    }
}
