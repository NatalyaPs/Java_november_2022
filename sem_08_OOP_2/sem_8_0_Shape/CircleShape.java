package sem_08_OOP_2.sem_8_0_Shape;

public class CircleShape extends Shape{
    private float radius;
    
    public CircleShape(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public float getPerimetr() {
        return 2 * (float) Math.PI * radius;
    }

    @Override
    public String toString() {
        return "CircleShape [radius=" + radius + "]";
    }  
}
