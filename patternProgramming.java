import java.util.Scanner;

public class patternProgramming {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter size of pattern:");
            int n = input.nextInt();
            //a normal pattern
            for(int i = 1; i <=n ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            //a star pattern
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n- i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println(); 
            }

        }
    }

}
