public class Manager extends Employee {
    int bonus;

    public Manager(String name, String surname, String phone, int socialInsuranceNumber, double monthlyWage) {
        super(name, surname, phone, socialInsuranceNumber, monthlyWage);
    }

    public void awardBonus(double bonus) {
        this.bonus += bonus;
    }

    @Override
    public double pay() {
        double pay = super.pay() + bonus;

        this.bonus = 0;

        return pay;
    }
}
