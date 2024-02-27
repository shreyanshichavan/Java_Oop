import java.util.Scanner;

public class PracticalNo4
 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name (format: <first name> <last name>):");
        String fullName = scanner.nextLine();
        printName(fullName);
        scanner.close();
    }

    public static void printName(String name) 
    {
        
        name = name.trim();
        String[] parts = name.split(" ");
        String firstName = parts[0];
        String lastName = parts[parts.length - 1];
        System.out.println(lastName + ", " + firstName);
    }
}