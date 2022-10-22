public abstract class StaffMember {
    protected String name;
    protected String surname;
    protected String phone;

    public StaffMember(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + phone;
    }

    public abstract double pay();
}
