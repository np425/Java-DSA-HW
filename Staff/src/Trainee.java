public class Trainee extends StaffMember {
    public Trainee(String name, String surname, String phone) {
        super(name, surname, phone);
    }

    @Override
    public double pay() {
        return 0;
    }
}
