import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salaryRate;

    public Employee(int id, String name, int age, String department, String code, double salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getCode() {
        return code;
    }

    public double getSalaryRate() {
        return salaryRate;
    }
}

public class EmployeeManagementApp {
    private List<Employee> employees;

    public EmployeeManagementApp() {
        employees = new ArrayList<>();
    }

    public void displayEmployeeList() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Code: " + employee.getCode());
            System.out.println("Salary Rate: " + employee.getSalaryRate());
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);

    }

    public void removeEmployee(int employeeId) {
        Employee employeeToRemove = null;
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        EmployeeManagementApp app = new EmployeeManagementApp();

        // Khởi tạo 10 nhân viên mẫu
        app.addEmployee(new Employee(1, "Nguyen Minh An", 30, "IT", "JD001", 2500));
        app.addEmployee(new Employee(2, "Tran Manh Hung", 35, "HR", "JS001", 3000));
        app.addEmployee(new Employee(3, "Mai Anh Dao", 28, "Sales", "MJ001", 2000));
        app.addEmployee(new Employee(4, "Hoang Ai Tue Oanh", 32, "Marketing", "ED001", 2800));
        app.addEmployee(new Employee(5, "Nguyen Dieu Minh", 40, "IT", "DW001", 3500));
        app.addEmployee(new Employee(6, "Vu Cao Toai", 31, "IT", "SA001", 2700));
        app.addEmployee(new Employee(7, "Phan Lan Nhi", 33, "HR", "MB001", 2900));
        app.addEmployee(new Employee(8, "Nguyen Minh Ly", 29, "Sales", "OT001", 2200));
        app.addEmployee(new Employee(9, "Pham Huy Hoang", 36, "Marketing", "DL001", 2600));
        app.addEmployee(new Employee(10, "Nguyen Nhu Nhat Vu", 34, "IT", "SC001", 3200));

        // Hiển thị danh sách 10 nhân viên
        app.displayEmployeeList();

        // Thêm nhân viên mới
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập thông tin nhân viên:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary Rate: ");
        double salaryRate = scanner.nextDouble();

        app.addEmployee(new Employee(id, name, age, department, code, salaryRate));

        // Hiển thị danh sách sau khi thêm nhân viên mới
        app.displayEmployeeList();

        // Xóa nhân viên
        System.out.print("Nhập ID của nhân viên muốn xóa: ");
        int employeeId = scanner.nextInt();
        app.removeEmployee(employeeId);

        // Hiển thị danh sách sau khi xóa nhân viên
        app.displayEmployeeList();

        scanner.close();
    }
}