import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Створюємо співробітників
        Employee emp1 = new Employee("Developer", 3000.0);
        Employee emp2 = new Employee("Manager", 2500.0);

        // Створюємо департамент та додаємо співробітників
        Department department = new Department(Arrays.asList(emp1, emp2));

        // Створюємо компанію та додаємо департамент
        Company company = new Company(Arrays.asList(department));

        // Отримання репорту для департаменту
        SalaryReportVisitor departmentReportVisitor = new SalaryReportVisitor();
        department.accept(departmentReportVisitor);
        System.out.println("Звіт по департаменту: " + departmentReportVisitor.getReport());

        // Отримання репорту для всієї компанії
        SalaryReportVisitor companyReportVisitor = new SalaryReportVisitor();
        company.accept(companyReportVisitor);
        System.out.println("Звіт по компанії: " + companyReportVisitor.getReport());

    }
}