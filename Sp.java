public class Sp {
    public static void main(String args[]) {
        for(int i = 1; i <= 1000; i++){
            int number = i;
            int sum = 0;
            while(number != 0){
            int fact = 1;
               int digit =  number % 10;
               while(digit != 0){
                    fact = fact * digit;
                    digit = digit - 1;
               }
               sum = sum + fact;
               number = number / 10;
            }
            if(sum == i){
                System.out.println(i);
            }
    }
    }
}
