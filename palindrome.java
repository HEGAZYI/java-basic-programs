import java.util.Scanner;
public class palindrome {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            String word;
            int flag = 0;
            System.out.println("enter the word to detect the palindrome :");
            word = input.nextLine();
            for(int i =word.length()-1,j=0; i >=0 &&j<=i ; i--,j++){
                if(word.charAt(i) != word.charAt(j)){
                    flag = 1 ;
                }
            }
            if(flag == 1){
                System.out.println("it is not a palindrome");
            }else{
                System.out.println("it is a palindrome");
            }
            
        }
    }

}
