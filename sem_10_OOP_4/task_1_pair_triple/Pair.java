package sem_10_OOP_4.task_1_pair_triple;

public class Pair<First, Second> {
    private First first;
    private Second second;

    public Pair(First first, Second second) {
        this.first = first;
        this.second = second;
    }

    public First getFirst() {
        return first;
    }

    public Second getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }
    
    // в задаче не требуется запихивать этот класс в коллекцию, 
    // поэтому equals, hashCode не делаем, как для полноценного класса


    
}
