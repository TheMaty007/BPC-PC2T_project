import java.util.Scanner;

public class MenuActions {
    private static void waitForEnter(Scanner scanner) {
        System.out.print("Press Enter to return to the menu...");
        scanner.nextLine();
    }

    public static void addEmployee(Scanner scanner) {
        System.out.println("[TODO]");
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