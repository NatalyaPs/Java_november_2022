package sem_06_task_2_b_cat;

import java.util.List;

// к заданию про кошек Куклачева

// действия
public class Action {
    private String trickName;
    private String coach;

    // трюки
    public Action(String trickName, String coach) {
        this.trickName = trickName;
        this.coach = coach;
    }

    public String getTrickName() {
        return trickName;
    }
 
    // дрессировщик
    public String getCoach() {
        return coach;
    }

    // можно поменять дрессировщика
    public void setCoach(String coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Action{" +
                "trickName='" + trickName + '\'' +
                ", coach='" + coach + '\'' +
                '}';
    }
}
