public class Employee extends StaffMember {
    private final int socialInsuranceNumber;
    private final double monthlyWage;

    public Employee(String name, String surname, String phone, int socialInsuranceNumber, double monthlyWage) {
        super(name, surname, phone);
        this.socialInsuranceNumber = socialInsuranceNumber;
        this.monthlyWage = monthlyWage;
    }

    @Override
    public double pay() {
        return this.monthlyWage;
    }
}
