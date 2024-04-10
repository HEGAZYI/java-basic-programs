import java.util.Scanner;
public class prime {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            int flag = 0;
            System.out.println("enter the number if it is prime or not:");
            number= input.nextInt();
            for (int i = 2; i<number ; i++) {
                if (number%i==0) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(number+" is not a prime number");
            } else {
                System.out.println(number+" is a prime number");
            }

        }
    }
}
