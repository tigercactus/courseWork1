public class Employee {
    private String fullName;
    private int Department;
    private int Salary;
    private int id;
    private static int counter;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.Department = department;
        this.Salary = salary;
        id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return Department;
    }

    public int getSalary() {
        return Salary;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return id + " Сотрудник: "
               + fullName  +
                ", Отдел: " + Department +
                ", Зарплата: " + Salary;

    }
}


