import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter the number of terms :");
            int first = 0 , second = 1 , i,number  ;
            number = input.nextInt();
            int next ;
            for (i = 0; i <number ; i++) {
                if(i<=1){
                    next = i ;
                }else{
                    next = first + second;
                    first = second ;
                    second = next ;
                }
            
            System.out.print(" " + next);
        }
    }

    }

}
