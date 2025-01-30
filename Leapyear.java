import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Alternative condition: If the year is divisible by 4 and either not divisible by 100 or divisible by 400
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
}

