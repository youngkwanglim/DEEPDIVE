package mission0826;

public class Manager extends Employee {
    private int numOfEmployees;

    public Manager(String name, int salary, String position, int numOfEmployees) {
        super(name, salary, position);
        this.numOfEmployees = numOfEmployees;
    }

    public void showManagerInfo(){
        super.showEmpInfo();
        System.out.println("사원 수 : " + numOfEmployees);
    }
}
