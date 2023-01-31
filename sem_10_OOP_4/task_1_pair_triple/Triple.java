package sem_10_OOP_4.task_1_pair_triple;

public class Triple<First, Second, Third> {
    private First first;
    private Second second;
    private Third third;
    
    public Triple(First first, Second second, Third third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public First getFirst() {
        return first;
    }

    public Second getSecond() {
        return second;
    }

    public Third getThird() {
        return third;
    }

    @Override
    public String toString() {  // исправили
        return "Triple(" + first + ", " + second + ", " + third + ")";
    }

    
}
