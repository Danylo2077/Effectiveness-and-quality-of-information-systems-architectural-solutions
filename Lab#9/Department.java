import java.util.List;

public class Department implements Visitable {
    private List<Employee> employees;

    public Department(List<Employee> employees) {}

    public List<Employee> getEmployees() { return null; }

    @Override
    public void accept(Visitor visitor) {}
}