public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("MUDRIK", "IDDI", 5000000);
        Employee employee2 = new Employee("SALMA", "JUMA", 8000000);
        System.out.println("Employee1 information\n"+employee1.employeeInf());
        System.out.println("Employee2 information\n"+employee2.employeeInf());
        employee1.salaryRaise(10);
        employee2.salaryRaise(10);
        System.out.println("Employee1 information after 10 raise\n"+employee1.employeeInf());
        System.out.println("Employee2 information after 10 raise\n"+employee2.employeeInf());

    }
}
