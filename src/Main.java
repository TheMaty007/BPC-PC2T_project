public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Employee employee1 = new DataAnalyst("Jan", "Novák", 1990);
        Employee employee2 = new SecuritySpecialist("Petr", "Svoboda", 1985);

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        
        System.out.println("All employees in the company:");
        for (Employee employee : company.getAllEmployees().values()) {
            System.out.println(employee);
            employee.perform();
            System.out.println("---");
        }
    }
}
