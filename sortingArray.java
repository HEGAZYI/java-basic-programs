import java.util.Arrays;
import java.util.Scanner;
public class sortingArray {
    public static void main(String args[]){
        try(Scanner input = new Scanner(System.in)){
            System.out.println(("enter the size of the array:"));
            int n = input.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the elements of the array of size {"+n+"}:");
            for(int i =0;i<n;i++){
                int number = input.nextInt();
                arr[i]= number;
            }
            System.out.println("the original array:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            //use [Arrays] method (sort()) to sort the array arr
            Arrays.sort(arr);
            System.out.println("the sorted array:");
            for(int  i=0 ;i<n;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
