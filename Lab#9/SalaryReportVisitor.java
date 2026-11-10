public class SalaryReportVisitor implements Visitor {
    @Override
    public void visitCompany(Company company) {}

    @Override
    public void visitDepartment(Department department) {}

    @Override
    public void visitEmployee(Employee employee) {}

    // Метод для отримання готового репорту
    public String getReport() { return ""; }
}