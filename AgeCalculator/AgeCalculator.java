package AgeCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
 
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Prompt the user to enter their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthDateString = scanner.nextLine();
 
        // Parse the input string to LocalDate
        LocalDate birthdate = LocalDate.parse(birthDateString);
 
        // Calculate the age
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
 
        // Output the age
        System.out.println("Your age is: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " + age.getDays() + " days.");
 
        scanner.close();
    }
}
