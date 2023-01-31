package dip;

public class Switch {
    private Lamp lamp;

    public Switch () {
        lamp = new Lamp ();
    }

    public void toggle () {
        if (lamp.getIsOn())
            lamp.turnOff ();
        else
            lamp.turnOn ();
    }
}
