import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {
    @Test
    void compareEqualNumbers() {
        Employee employeeA = new Employee("Yordan", 20_000, 4);
        Employee employeeB = new Employee("Petur", 20_000, 4);
        assertTrue(employeeA.compareTo(employeeB) == 0);
    }

    @Test
    void compareLargerToSmallerNumbers() {
        Employee employeeA = new Employee("Yordan",  30_000, 5);
        Employee employeeB = new Employee("Petur",  20_000, 4);
        assertTrue(employeeA.compareTo(employeeB) > 0);
    }

    @Test
    void compareSmallerToLargerNumbers() {
        Employee employeeA = new Employee("Yordan",  20_000, 4);
        Employee employeeB = new Employee("Petur",  30_000, 5);
        assertTrue(employeeA.compareTo(employeeB) < 0);
    }

    @Test
    void testIfListOfEmployeesIsSorted() {
        // Create a list and sort it
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Yordan",  20_000, 4));
        employeeList.add(new Employee("Petur",  15_000, 4));
        employeeList.add(new Employee("Kaloqn",  15_000, 4));
        employeeList.add(new Employee("Alex", 18_500, 4));
        Collections.sort(employeeList);

        // Check if the elements of the list are sorted
        for (int i = 0; i < employeeList.size() - 1; i++) {
            Employee employeeA = employeeList.get(i);
            Employee employeeB = employeeList.get(i+1);
            assertTrue(employeeA.compareTo(employeeB) <= 0,
                    "List is not sorted correctly");
        }
    }

}