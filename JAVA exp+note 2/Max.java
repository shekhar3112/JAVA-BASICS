import java.util.Scanner;

class Max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        
        int largest = Math.max(num1, Math.max(num2, num3));
        
        System.out.println("The largest number is: " + largest);
        
    }
}
