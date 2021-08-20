import java.util.Scanner;

public class Armstrong {
  public static void main(String args[]){
      // WAP to check number is armstron gor not
      Scanner scan = new Scanner(System.in);
      //System.out.println("Enter any number");
     // int number = scan.nextInt();
     //int number;
      for(int i= 1; i<=1000; i++){
        int temp = i;
        int number = i;
        int sum = 0;
        for(;number!=0; number = number/10){
            int digit = (number%10) ; 
            sum = sum + (digit * digit * digit);
        }
        if(sum == temp){
            System.out.println(sum);
        }
    }
  }  
}
