package SpecialGifts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
 
public class SpecialGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 
 
        // Get the names of students
        List<String> studentNames = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            studentNames.add(name);
        }
 
        // Use Stream API and lambda expression to filter students whose names start with "A"
        List<String> studentsWithAGift = studentNames.stream()
                                                     .filter(name -> name.startsWith("A"))
                                                     .collect(Collectors.toList());
 
        // Print the students who receive special gifts
        System.out.println("Students who receive special gifts:");
        for (String student : studentsWithAGift) {
            System.out.println(student);
        }
 
        scanner.close();
    }
}
