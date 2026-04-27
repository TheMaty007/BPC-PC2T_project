import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);

        // Není hotové Add employee, takže hezky růčo zatím skrz testing ostatních věcí
        Employee employee1 = new DataAnalyst("Jan", "Novák", 1990);
        Employee employee2 = new SecuritySpecialist("Petr", "Svoboda", 1985);
        System.out.println("--- Loading data from SQL database (TO-DO) ---");

        company.addEmployee(employee1);
        company.addEmployee(employee2);

        boolean running = true;
        while (running) {
            System.out.println("=== EMPLOYEE DATABASE ===");
            System.out.println("1. Add employee");
            System.out.println("2. Add collaboration");
            System.out.println("3. Remove employee");
            System.out.println("4. Find employee by ID");
            System.out.println("5. Execute employee skill");
            System.out.println("6. Alphabetical list of employees in groups");
            System.out.println("7. Show statistics");
            System.out.println("8. List number of employees in groups");
            System.out.println("9. Save employees to file");
            System.out.println("10. Load employees from file");
            System.out.println("0. Exit program (and save to SQL)");
            System.out.print("Select an action: ");

            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    MenuActions.addEmployee(scanner);
                    break;
                case 2:
                    MenuActions.addCollaboration(scanner);
                    break;
                case 3:
                    MenuActions.removeEmployee(company, scanner);
                    break;
                case 4:
                    MenuActions.findEmployeeById(company, scanner);
                    break;
                case 5:
                    MenuActions.executeEmployeeSkill(scanner);
                    break;
                case 6:
                    MenuActions.aphabeticalListEmployees(scanner);
                    break;
                case 7:
                    MenuActions.showStatistics(scanner);
                    break;
                case 8:
                    MenuActions.listEmployeesInGroups(scanner);
                    break;
                case 9:
                    MenuActions.saveEmployeesToFile(scanner);
                    break;
                case 10:
                    MenuActions.loadEmployeesFromFile(scanner);
                    break;
                case 0:
                    System.out.println("[TODO] - save to SQL");
                    System.out.println("Bye");
                    running = false;
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again\n");
            }
        }
        scanner.close();
    }

    
}
