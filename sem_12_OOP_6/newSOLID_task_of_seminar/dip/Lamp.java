package sem_12_OOP_6.newSOLID_task_of_seminar.dip;

public class Lamp implements Device{
    private boolean isOn;

    @Override
    public void turnOn () { isOn = true; System.out.println("Light is on!"); }

    @Override
    public void turnOff () { isOn = false; System.out.println("Light is off!"); }

    @Override
    public boolean getIsOn () { return isOn; }
}
