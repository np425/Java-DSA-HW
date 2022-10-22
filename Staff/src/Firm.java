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

        Manager manager = new Manager("John", "Xina", "123", 321, 3.0);
        manager.awardBonus(150);
        staff.addStaffMember(
                manager
        );


        HourlyWorker hourlyWorker = new HourlyWorker("WorkerA", "Cena", "123", 321, 4.0);
        hourlyWorker.addHours(10);
        staff.addStaffMember(
                hourlyWorker
        );

        HourlyWorker hourlyWorker1 = new HourlyWorker("WorkerB", "Cena", "123", 321, 5.0);
        hourlyWorker1.addHours(20);
        staff.addStaffMember(
                hourlyWorker1
        );

        return staff;
    }
}
