package METHODS;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class time {
    public static void main(String[] args) {
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);
    }
}
