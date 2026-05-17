package streams;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {

    static void main(String[] args) {

        // Create a scanner object to read user input
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter your birthdate (YYYY-MM-DD): ");

            String birthDateString = scanner.nextLine();

            LocalDate birthDate = LocalDate.parse(birthDateString);

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            Period age = Period.between(birthDate, currentDate);

            System.out.println("You are " + age.getYears() + " years old.");
        }
    }
}
