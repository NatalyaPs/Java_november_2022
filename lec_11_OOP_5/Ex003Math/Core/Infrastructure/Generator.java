package Ex003Math.Core.Infrastructure;

import java.util.Random;

public class Generator {
    static Random r = new Random();

    public static int number() { // ПРОСТО ОБЕРТКА ДЛЯ ГЕНЕРАТОРА СЛУЧ.ЧИСЕЛ    
        return r.nextInt(10, 15);
    }
}
