public class DataAnalyst extends Employee {

    public DataAnalyst(String firstName, String lastName, int birthYear) {
        super(firstName, lastName, birthYear);
    }

    @Override
    public void perform() {
        System.out.println("DataAnalyst " + getFirstName() + " will do smth...");
        // TO-DO - POC
    }
}