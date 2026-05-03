import java.util.Scanner;

public class MenuActions {
    private static void waitForEnter(Scanner scanner) {
        System.out.print("\nPress Enter to return to the menu...");
        scanner.nextLine();
    }

    public static void addEmployee(Company company, Scanner scanner) {
        System.out.println("Select employee type:");
        System.out.println("1. Data Analyst");
        System.out.println("2. Security Specialist");
        System.out.print("Type: ");

        int type;
        try {
            type = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid option. Please try again");
            waitForEnter(scanner);
            return;
        }

        if (type != 1 && type != 2) {
            System.out.println("Invalid option. Please try again");
            waitForEnter(scanner);
            return;
        }

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Birth year: ");

        int birthYear;
        try {
            birthYear = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid option. Please try again");
            waitForEnter(scanner);
            return;
        }

        if (firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("First name and last name cannot be empty");
            waitForEnter(scanner);
            return;
        }

        Employee newEmployee;
        if (type == 1) {
            newEmployee = new DataAnalyst(firstName, lastName, birthYear);
        } else {
            newEmployee = new SecuritySpecialist(firstName, lastName, birthYear);
        }

        company.addEmployee(newEmployee);
        System.out.println("Employee added: " + newEmployee);
        waitForEnter(scanner);
    }

    public static void addCollaboration(Scanner scanner) {
        System.out.println("[TODO]");
        waitForEnter(scanner);
    }

    public static void removeEmployee(Company company, Scanner scanner) {
        System.out.print("Enter employee ID to remove: ");
        try {
            int idToRemove = Integer.parseInt(scanner.nextLine());
            company.removeEmployee(idToRemove);
            System.out.println("Removal request processed");
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID.");
        }
        waitForEnter(scanner);
    }

    public static void findEmployeeById(Company company, Scanner scanner) {
        System.out.print("Enter employee ID: ");
        try {
            int idToFind = Integer.parseInt(scanner.nextLine());
            Employee employee = company.getEmployee(idToFind);
            if (employee != null) {
                System.out.println(employee);
            } else {
                System.out.println("Employee with this ID not found");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID");
        }
        waitForEnter(scanner);
    }

    public static void executeEmployeeSkill(Scanner scanner) {
        System.out.println("[TODO]");
        waitForEnter(scanner);
    }

    public static void aphabeticalListEmployees(Scanner scanner) {
        System.out.println("[TODO]");
        waitForEnter(scanner);
    }

    public static void showStatistics(Scanner scanner) {
        System.out.println("[TODO]");
        waitForEnter(scanner);
    }

    public static void listEmployeesInGroups(Scanner scanner) {
        System.out.println("[TODO]");
        waitForEnter(scanner);
    }

    public static void saveEmployeesToFile(Scanner scanner) {
        System.out.println("[TODO]");
        waitForEnter(scanner);
    }

    public static void loadEmployeesFromFile(Scanner scanner) {
        System.out.println("[TODO]");
        waitForEnter(scanner);
    }
}