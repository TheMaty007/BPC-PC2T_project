import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<Integer, Employee> employees;

    public Company() {
        this.employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void removeEmployee(int id) {
        if (employees.containsKey(id)) {
            employees.remove(id);
            // TO-DO
        }
    }

    public Map<Integer, Employee> getAllEmployees() {
        return employees;
    }
}