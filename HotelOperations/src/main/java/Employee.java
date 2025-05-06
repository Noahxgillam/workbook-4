import java.time.LocalDateTime;

public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee() {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.startTime = -1;
    }

    public double getTotalPay() {
        ;
        return getRegularHours() * payRate + getOvertimeHours() * payRate;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40,0);
    }

    public void PunchIn(double time) {

        if (startTime != -1) {
            System.out.println(name + " already punched in");
            return;
        }
        startTime = LocalDateTime.now();
        System.out.println("Punch In time at " + startTime);

    }
    void pumchOut(double time) {
        if (startTime == -1)
        double todaysHours = time - this.startTime;
        this.hoursWorked = this.hoursWorked + todaysHours;
    }
}

