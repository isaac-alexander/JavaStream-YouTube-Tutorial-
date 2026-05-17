package streams.group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class GroupEmployeesByAge {

    static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Oliver", 30),
                new Employee(2, "Chloe", 28),
                new Employee(3, "Clark", 32),
                new Employee(4, "Lois", 35),
                new Employee(5, "Olsen", 30),
                new Employee(6, "Kara", 28)
        );

        //Group the Employees by age
        Map<Integer, List<Employee>> map = employees.stream()
                        .collect(Collectors.groupingBy(employee -> employee.getAge()));

        map.forEach((key, List) -> {
            System.out.println("Age: " + key);
            System.out.println("List of employees: " + List);
        });
    }
}
