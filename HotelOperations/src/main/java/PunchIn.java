import java.time.LocalDateTime;

public class PunchIn {

    public static void main(String[] args) {

        if (startTime != -1) {
            System.out.println(name + " already punched in");
            return;
        }
        System.out.println("Punch In time at " + time);
        startTime = time;
    }
}
