package Ex007;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

// В Ex007 получаkjcm, что мы на олимпиаду можем отправить команду, где участники разных уровней. Надо исправить -> смотриим EX007: в классе Team меняем <T>
public class Ex002_Game {
    public static void main(String[] args) {
        System.out.println("Ex002_Game");
        Team<Intern> team1 = new Team<>("Воробушки");   // тип закрывающего обобщения сейчас выбрали интерна и дргие типы добавить нельзя
        team1.add(Gb.CreateIntern());
        team1.add(Gb.CreateIntern());
        System.out.println(team1);

        Team<Intern> team2 = new Team<>("Хлебушки ");
        team2.add(Gb.CreateIntern());
        team2.add(Gb.CreateIntern());
        // team2.add(Gb.CreateMiddle());        //  добавить другой тип просто так не получится
        System.out.println(team2);

        var o = new Olympiad<Intern>(team1, team2);  // тип закрывающего обобщения сейчас выбрали интерна и дргие типы добавить нельзя
        o.start();
        System.out.println("st1 vs st2");

        // #region   ---   ОШИБКА    --- смотрим Ex008  
        //  -------------------------------------------
        var st1 = new Team<String>("string team 1");    // но тут получается. что можем создать команду из строк
        var st2 = new Team<String>("string team 1");

        Olympiad<String> o1 = new Olympiad<>(st1, st2);
        o1.start();

        // #endregion
    }
}

abstract class Programmer {
    private String fullName;
    private int age;

    public Programmer() {
        Random r = new Random();
        String tName = UUID.randomUUID().toString().substring(0, 5);
        int tAge = r.nextInt(18, 55);
        this.fullName = String.format("Имя_%s", tName);
        this.age = tAge;
    }

    @Override
    public String toString() {

        String sn = this.getClass().getSimpleName();
        return String.format("[%s %d >%s]", fullName, age, sn);
    }
}

class Intern extends Programmer {
    public Intern() {
        super();
    }
}

class Junior extends Programmer {
    public Junior() {
        super();
    }
}

class Middle extends Programmer {
    public Middle() {
        super();
    }
}

class Principal extends Programmer {
    public Principal() {
        super();
    }
}

class Team<T> {      //  добавляем <T> типы
    private String name;
    private List<T> programmers;  //  добавляем <T> типы

    public Team(String name) {
        this.name = name;
        programmers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(T p) {    //  добавляем <T> типы
        programmers.add(p);
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, programmers);
    }

}

class Olympiad<T> {    //  добавляем <T> типы

    Team<T> team1, team2;    //  добавляем <T> типы  - т.е. Олимпиада только между командами с одинаковым типом
    Random r = new Random();

    public Olympiad(Team<T> t1, Team<T> t2) {    //  добавляем <T> типы
        team1 = t1;
        team2 = t2;
    }

    public void start() {
        String winner = r.nextInt(2) == 0 ? team1.getName() : team2.getName();
        System.out.println(String.format("Winner: %s", winner));
    }
}

class Gb {                  ///   тоже меняется

    public static Intern CreateIntern() {
        return new Intern();
    }

    public static Middle CreateMiddle() {
        return new Middle();
    }

    public static Principal CreatePrincipal() {
        return new Principal();
    }
}