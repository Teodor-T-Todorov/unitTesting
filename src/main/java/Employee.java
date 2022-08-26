public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    private int workExperience;

    public Employee(String name, int salary, int workExperience) {
        this.name = name;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workExperience=" + workExperience +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(this.getSalary(), e.getSalary());
    }
}

