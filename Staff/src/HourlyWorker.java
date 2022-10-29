public class HourlyWorker extends Employee {
    int hoursWorked;

    public HourlyWorker(String name, String surname, String phone, int socialInsuranceNumber, double monthlyWage) {
        super(name, surname, phone, socialInsuranceNumber, monthlyWage);
    }

    public HourlyWorker addHours(int hoursWorked) {
        this.hoursWorked += hoursWorked;
        return this;
    }

    @Override
    public double pay() {
        double pay = super.pay() * this.hoursWorked;

        this.hoursWorked = 0;

        return pay;
    }
}
