import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Yordan",  20_000, 4));
        employeeList.add(new Employee("Petur", 15_000, 4));
        employeeList.add(new Employee("Kaloqn", 17_000, 4));
        employeeList.add(new Employee("Alex", 18_500, 4));

        Collections.sort(employeeList);
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
