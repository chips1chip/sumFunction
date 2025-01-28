import java.util.Scanner;
public class SumFunc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();  // Read first number
        int num2 = sc.nextInt();  // Read second number
        int sum = add(num1, num2);  // Call add function to get sum
        System.out.println("the sum is " + sum);  // Print the sum
        sc.close();
    }

    // Function to add two numbers
    public static int add(int num1, int num2){
        return num1 + num2;  // Return the sum of num1 and num2
    }
}
