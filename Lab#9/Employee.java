public class Employee implements Visitable {
    private String position;
    private double salary;

    public Employee(String position, double salary) {}

    public double getSalary() { return 0.0; }
    public String getPosition() { return ""; }

    @Override
    public void accept(Visitor visitor) {}
}