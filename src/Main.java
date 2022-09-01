public class Main {

    static Employee[] Employees = new Employee[10];
    public static void main(String[] args) {
        Employees[1] = new Employee("Морозов Лев Егорович", 2, 100_000);
        Employees[2] = new Employee("Владимирова Ульяна Михайловна", 1, 150_000);
        Employees[3] = new Employee("Молчанов Матвей Степанович", 3, 160_000);
        Employees[4] = new Employee("Иванова Мирослава Ярославовна", 4, 140_000);
        Employees[5] = new Employee("Любимова Зоя Егоровна", 5, 170_000);
        Employees[6] = new Employee("Майорова Елизавета Ивановна", 2, 180_000);
        Employees[7] = new Employee("Шишкин Александр Владиславович", 5, 120_000);
        Employees[8] = new Employee("Андрианова Екатерина Максимовна", 4, 110_000);
        Employees[9] = new Employee("Семенов Дмитрий Алиевич", 1, 190_000);
        Employees[0] = new Employee("Ермолов Даниэль Андреевич", 3, 120_000);

        printEmployees();
        System.out.println("Сумма затрат на зарплаты за месяц составляет " + getAndCalculateSalarySum());
        System.out.println("Сотрудник с минимальной зарплатой: " + getMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + getMaxSalaryEmployee());
        System.out.println("Средняя зарплата составляет " + calculateAverageSalary() + " руб");
        printEmployeesFullName();

    }

    public static void printEmployees(){
        for (Employee employee : Employees){
            System.out.println(employee);
        }

    }

    public static int getAndCalculateSalarySum(){
        int sum = 0;
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                sum = sum + Employees[i].getSalary();
            }
        }
        return sum;
    }

     public static Employee getMinSalaryEmployee() {
         int minSalary = Employees[0].getSalary();
         Employee minSalaryEmployee = null;
         for (int i = 1; i < Employees.length; i++) {
             if (Employees[i] != null) {
                 if (minSalary > Employees[i].getSalary()) {
                     minSalary = Employees[i].getSalary();
                     minSalaryEmployee = Employees[i];
                 }
             }
         }
         return minSalaryEmployee;
     }


    public static Employee getMaxSalaryEmployee() {
        int maxSalary = Employees[0].getSalary();
        Employee maxSalaryEmployee = null;
        for (int i = 1; i < Employees.length; i++) {
            if (Employees[i] != null) {
                if (maxSalary < Employees[i].getSalary()) {
                    maxSalary = Employees[i].getSalary();
                    maxSalaryEmployee = Employees[i];
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static int calculateAverageSalary(){
        int salarySum = getAndCalculateSalarySum();
        int amountOfEmployees = Employees.length;
        int averageSalary = salarySum/amountOfEmployees;
        if (amountOfEmployees !=0){
        return averageSalary;
        }else {
            return 0;
        }

    }

    public static void printEmployeesFullName(){
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] !=null) {
                System.out.println(Employees[i].getFullName());
            }
        }
    }



}