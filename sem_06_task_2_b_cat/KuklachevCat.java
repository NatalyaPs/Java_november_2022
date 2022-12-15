package sem_06_task_2_b_cat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class KuklachevCat {
    private String name;
    private String breed;
    private String color;
    private LocalDate birthDate;
    private List<Action> action;

    public KuklachevCat(String name, String breed, String color, LocalDate birthDate) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.birthDate = birthDate;
        this.action = new ArrayList<>(); // в конструктор не включен в (), а записывается ниже отдельной функцией
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "KuklachevCat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", birthDate=" + birthDate +
                ", action=" + action +
                '}';
    }

    // ДОБАВИТЬ ТРЮКИ
    public void addTrick(Action act) {
        action.add(act);
    }
}
