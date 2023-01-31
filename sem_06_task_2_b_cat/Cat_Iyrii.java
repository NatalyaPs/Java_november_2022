// архив выставки котов
// ==================================
//  НЕ ИСПОЛЬЗОВАН 
// ============================== 


package sem_06_task_2_b_cat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cat_Iyrii {

    private String name;
    private String breed;
    private float weight;
    private List<String> owners;
    private LocalDate birthDay;
    private List<Award> awards; //// отдельный КЛАСС с наградами  // коллекция => во множественном числе - avards

    public Cat_Iyrii(String name, String breed, float weight, List<String> owners, LocalDate birthDay) {// здесь в аргументах awards убрали, но инициализировали ниже все равно, ч.б.не было null
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.owners = owners;
        this.birthDay = birthDay;
        this.awards = new ArrayList<>();// лучше пустая коллекция, чем  null // инициализация - создаем новый лист
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public List<String> getOwners() {
        return new ArrayList<>(owners);
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<Award> getAwards() {
        return new ArrayList<>(awards);
    }

    public void addAward(Award award) {
        awards.add(award);
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", breed=" + breed + ", weight=" + weight + ", owners=" + owners + ", birthDay="
                + birthDay + ", awards=" + awards + "]";
    }

}
