package dip;

public class Lamp {
    private boolean isOn;

    public void turnOn () { isOn = true; System.out.println("Light is on!"); }
    public void turnOff () { isOn = false; System.out.println("Light is off!"); }

    public boolean getIsOn () { return isOn; }
}
