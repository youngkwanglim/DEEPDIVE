package mission0826;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee("아놀드", 10000, "사원");
        Manager m = new Manager("슬롯", 20000, "팀장", 30);

        e.showEmpInfo();
        System.out.println("===============================");
        m.showManagerInfo();
    }
}
