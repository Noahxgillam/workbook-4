
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
        return getRegularHours() * payRate + getOvertimeHours() * payRate;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40,0);
    }

    public void punchIn(double time) {

        if (startTime != -1) {
            System.out.println(name + " already punched in");
            return;
        }
        System.out.println("Punch In time at " + startTime);

    }
    void punchOut(double time) {
        if (startTime == -1){
            System.out.println("Error: Employee has not punched in.");
        return;
    }
        double hoursWorkedNow = time - startTime;
        hoursWorked += hoursWorkedNow;
        startTime = 0; // Reset punch-in time
        System.out.println(name + " punched out at " + time + " (Worked " + hoursWorkedNow + " hours)");
    }
}

