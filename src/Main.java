public class Main {
    public static void main(String[] args) {
        Employee employee1 = new DataAnalyst("Jan", "Novák", 1990);
        Employee employee2 = new SecuritySpecialist("Petr", "Svoboda", 1985);

        System.out.println(employee1);
        employee1.perform();
        
        System.out.println("---");
        System.out.println(employee2);
        employee2.perform();

    }
}
