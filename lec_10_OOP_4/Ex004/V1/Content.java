package Ex004.V1;

public abstract class Content { // базовый тип
    public String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
