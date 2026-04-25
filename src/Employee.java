import java.util.HashMap;
import java.util.Map;

public abstract class Employee {
    private static int idCounter = 1;
    private int id, birthYear;
    private String firstName, lastName;

    protected Map<Integer, CooperationLevel> coworkers;

    public Employee(String firstName, String lastName, int birthYear) {
        this.id = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.coworkers = new HashMap<>();
    }

    public int getId() { return id; }
    public int getBirthYear() { return birthYear; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    public void addCoworker(int coworkerId, CooperationLevel level) {
        coworkers.put(coworkerId, level);
    }

    public Map<Integer, CooperationLevel> getCoworkers() {
        return coworkers;
    }

    public abstract void perform();

    @Override
    public String toString() {
        return String.format("[%d] %s %s (nar. %d)", id, firstName, lastName, birthYear);
    }
}