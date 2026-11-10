import java.util.List;

public class Company implements Visitable {
    private List<Department> departments;

    public Company(List<Department> departments) {}

    public List<Department> getDepartments() { return null; }

    @Override
    public void accept(Visitor visitor) {}
}