package mission0826;

public class Employee {
    private String name;
    private int salary;
    private String position;

    public Employee(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public void showEmpInfo(){
        System.out.println("이름 : " + this.name +
                            "\n연봉 : " + this.salary +
                            "\n직급 : " + this.position);
    }
}
