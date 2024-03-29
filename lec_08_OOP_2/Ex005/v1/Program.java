package lec_08_OOP_2.Ex005.v1;

import java.util.ArrayList;
import java.util.List;

import lec_08_OOP_2.Ex005.v1.Healers.Druid;
import lec_08_OOP_2.Ex005.v1.Healers.Healer;
import lec_08_OOP_2.Ex005.v1.Healers.Shaman;
import lec_08_OOP_2.Ex005.v1.Warriors.Knight;
import lec_08_OOP_2.Ex005.v1.Warriors.Paladin;
import lec_08_OOP_2.Ex005.v1.Warriors.Warrior;

public class Program {
    public static void main(String[] args) {
        
        //#region team1
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        // team1.get(0).attack

        var h = team1.get(0);

        if (h instanceof Warrior) {  //  воин
            ((Warrior) h).attack(null);
        }
        else if (h instanceof Healer) {   // целитель
            ((Healer) h).healing(null);
        } else {
            //....
        }
        //#endregion

        //#region team2
        List<Warrior> team2 = new ArrayList<>();
        //team2.add(new Druid());
        team2.add(new Paladin());
        team2.add(new Knight());

        team2.get(0).attack(null); // т.к. в этом списке только войны, то проверять на соответствие не надо, а можно сразу вызывать метод атаки

        List<Healer> team3 = new ArrayList<>(); // лекарь
        //team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);  // тоже можно без проверки, т.к. все лекари - метод лечения


        //#endregion



    }
}
