import java.util.Scanner;

public class reversalString {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter your string to be reersed :");
            String s = input.nextLine();
            int length = s.length();
            String reverse = "";
            for(int i = length - 1 ; i >=0 ; i--){
                reverse = reverse +s.charAt(i);
            }
            System.out.println("the reversed string : " + reverse);
        }

    }

}
