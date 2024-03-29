import java.util.*;

public class Main {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter an integer
    System.out.println("Enter a integer: ");
    long number = input.nextLong();
    
    // Display the sum of all the digits in the integer
    System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
  }
  // Create new method for SumDigits
  public static int sumDigits(long n) {
    // Initialize a variable to hold the sum of digits
    int sum = 0;
    // Loop until the number becomes 0
    while (n > 0) {
    // Get the last digit of the number by taking modulus 10
      sum += n % 10;
    // Remove the last digit from number by integer division with 10
      n /= 10;
    }
    return sum;
  
}
}