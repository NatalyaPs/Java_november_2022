package sem_06_task_2_a_cat;

public class Cat { // класс с полями
    // сначала пишем поля
    private String name;
    private String owner; // хозяин
    private String breed;  // порода
    private float weight;  // вес

    // затем конструктор
    // конструктор для инициализации - передаем поля из класса, но коллекции не передаются
    // для получения можно нажать на лампочку и выбрать Сгенерировать конструктор или Ctrl + .
    // если добавили поле в класс, то конструктор тоже надо обновить (создать новый, удалив старый)
    public Cat(String name, String owner, String breed, float weight) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.weight = weight;
    }

    // геттеры и сеттеры
    // так же на лампочку нажимаем и создаем
    // нужны,ч.б. пользоваться приватными полями
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }



    public void meow () {
        System.out.println("Meow!");
    }

    
    // сгенерировать через лампочку toString, ч.б. печатать
    @Override
    public String toString() {
        return "Cat [name=" + name + ", owner=" + owner + ", breed=" + breed + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((breed == null) ? 0 : breed.hashCode());
        result = prime * result + Float.floatToIntBits(weight);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (breed == null) {
            if (other.breed != null)
                return false;
        } else if (!breed.equals(other.breed))
            return false;
        if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
            return false;
        return true;
    }

    
}
