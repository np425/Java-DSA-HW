import java.util.ArrayList;

public class Staff {
    ArrayList<StaffMember> staffList = new ArrayList<>();

    void addStaffMember(StaffMember member) {
        this.staffList.add(member);
    }

    double payDay() {
        return staffList.stream().reduce(0.0, (subTotal, member) -> subTotal + member.pay(), Double::sum);
    }
}
