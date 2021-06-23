package Classes.SalaryCalculator;

public class Main {
    
    public static void main(String[] args) {
        
        Employee employee = new Employee("kemal", "lamek", 2000, 45, 1985);

        
        String output = employee.toString();

        System.out.println(output);
    }
}
