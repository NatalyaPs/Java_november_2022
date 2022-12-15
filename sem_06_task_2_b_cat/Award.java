package sem_06_task_2_b_cat;

// отдельный класс - награды
public class Award { 
    private String contest; // конкурс
    private String place; // место
    private int year; 

    // конструктор
    public Award(String contest, String place, int year) {
        this.contest = contest;
        this.place = place;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Award{" +
                "contest='" + contest + '\'' +
                ", place='" + place + '\'' +
                ", year=" + year +
                '}';
    }
}
