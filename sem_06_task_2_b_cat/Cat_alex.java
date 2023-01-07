package sem_06_task_2_b_cat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
) архивом выставки котов
 */
public class Cat_alex {
    private String name;
    private String breed;
    private String color;
    private LocalDate birthDate;
    private List<Award> awards; // отдельный КЛАСС с наградами  // коллекция => во множественном числе - Avards
    private String owner;

    public Cat_alex(String name, String breed, String color, LocalDate birthDate, String owner) { // здесь в аргументах awards убрали, но инициализировали ниже все равно, ч.б.не было null
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.birthDate = birthDate;
        this.owner = owner;
        this.awards = new ArrayList<>(); // лучше пустая коллекция, чем  null // инициализация - создаем новый лист
    }

    // для коллекций не делают get, set, т.к. посторонний может получить доступ к коллекции   !!!!!

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

    public String getOwner() {
        return owner;
    }

    // увидеть информ. о коте и награды
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", birthDate=" + birthDate +
                ", awards=" + awards +
                ", owner='" + owner + '\'' +
                '}';
    }

    // метод для добавления наград.  Разрешено только добавлять награду.
    public void addAward(Award award) { // 1 награда
        awards.add(award); // добавить в коллекцию  // здесь не обязательно писать this.awards.add(award). Java сама угадывает, что здесь this, так же, как и в get-терах
    }
}
