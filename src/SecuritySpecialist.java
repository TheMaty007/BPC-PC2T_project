public class SecuritySpecialist extends Employee {

    public SecuritySpecialist(String firstName, String lastName, int birthYear) {
        super(firstName, lastName, birthYear);
    }

    @Override
    public void perform() {
        System.out.println("SecuritySpecialist " + getFirstName() + " will do smth...");
        // TO-DO - POC
    }
}