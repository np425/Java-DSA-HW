public class Firm {
    public static Staff generateStaff() {
        Staff staff = new Staff();

        staff.addStaffMember(
                new Employee("John", "Cena", "123", 321, 1.0)
        );
        staff.addStaffMember(
                new Employee("Bruce", "Lee", "123", 321, 2.0)
        );
        staff.addStaffMember(
                new Trainee("John", "Cena", "123")
        );
        staff.addStaffMember(
                new Manager("John", "Xina", "123", 321, 3.0).awardBonus(150)
        );
        staff.addStaffMember(
                new HourlyWorker("WorkerA", "Cena", "123", 321, 4.0).addHours(10)
        );
        staff.addStaffMember(
                new HourlyWorker("WorkerB", "Cena", "123", 321, 5.0).addHours(20)
        );

        return staff;
    }
}
