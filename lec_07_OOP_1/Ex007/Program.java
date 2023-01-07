package lec_07_OOP_1.Ex007;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
      
        // #region ex1 Demo

        // BaseHero hero3 = new Magician(); // в переменную базового класса кладем переменную производного класса 
        // System.out.println(hero3.getInfo());

        // BaseHero hero4 = new Priest(); // в переменную базового класса кладем переменную производного класса 
        // System.out.println(hero4.getInfo());

        // #endregion

        // #region ex2 Attack
        // System.out.println("------");
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // hero3.Attack(hero4);
        
        // hero4.Attack(hero3);
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // #endregion

        // #region Teams

        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;
 
        // проинцип полиморфизма при создании команды. 
        // т.е. получаем КОЛЛЕКЦИЮ из 10 персонажей со своими типами
        List<BaseHero> teams = new ArrayList<>();  // создаем команду героев
        for (int i = 0; i < teamCount; i++) {
            if (rand.nextInt(2) == 0) { // если 0, то жрец
                teams.add(new Priest());
                priestCount++;
            }
            else{
                teams.add(new Magician());  // если 1, то маг создается
                magicianCount++;  
            }

            System.out.println(teams.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("magicalCount: %d priestCount: %d \n\n", magicianCount, priestCount);
        
        // attack

        // #endregion

        // todo добавить ещё один класс и 
        // реализовать возможность лечения героев
    }
}