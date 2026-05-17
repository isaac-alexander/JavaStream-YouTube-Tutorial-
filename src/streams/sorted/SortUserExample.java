package streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SortUserExample {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Rain", 30),
                new User("Zeus", 28),
                new User("Sam", 35),
                new User("Icarus", 32),
                new User("Bolt", 25)
        );

        // Sort the user by  age in ascending order
        List<User> result = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();

        System.out.println(result.toString());

        // Sort the user by  age in descending order
        List<User> result2 = users.stream()
                .sorted(Comparator.comparingInt(User::getAge).reversed())
                .toList();

        System.out.println(result2.toString());

        // Sort the user by name in ascending order
        List<User> nameResult = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .toList();

        System.out.println(nameResult.toString());

        // Sort the user by name in descending order
        List<User> nameResult2 = users.stream()
                .sorted(Comparator.comparing(User::getName).reversed())
                .toList();

        System.out.println(nameResult2.toString());

    }
}
