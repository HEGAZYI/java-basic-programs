import java.util.Scanner;

public class armstrongNumber {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            System.out.println("enter the number if it is an armstrong number or not:");
            number = input.nextInt();
            int originalCopy = number;
            int numberOfDigits = String.valueOf(number).length();
            int sum = 0 ;
            while(number > 0){
                int digit = number%10;
                sum += Math.pow(digit,numberOfDigits);
                number = number / 10 ;
            }
            
            if (originalCopy == sum ) {
                System.out.println(originalCopy + " is an Armstrong Number");
            } else {
                System.out.println(originalCopy + " is not an Armstrong Number");
            }

        }
    }
}
