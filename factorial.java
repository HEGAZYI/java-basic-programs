import java.util.Scanner;
public class factorial {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int factorial =1;
            System.out.println("enter the number :");
            int number  ;
            number = input.nextInt();
            for (int i = 1; i <=number ; i++) {
                if(number<=1){
                    factorial = 1 ;
                }else{
                    factorial = factorial * i ;
                }
            }
            System.out.print("the factorial of the number {"+number+ "} = "+factorial);
        }
}
}
