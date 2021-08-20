
public class Special {
    public static void main(String args[]){
        // WAP in java to print the special number between lower limit and upper limit
        // 5! = 5*4*3*2*1 = 120
        // 145 = 1! + 4! + 5! = 145
        for(int i = 1; i <= 1000 ; i++){
        int temp = i;
        int specialSum = 0;
        while(temp != 0){
            int digit = temp % 10; // 14 % 10 = 4 = 24
            int fact = 1;
            int sum = 0;
            while( digit != 0){
                fact = fact * digit;
                digit = digit-1;
            }
            sum = sum + fact;
            specialSum = specialSum + sum; // 120 + 24 + 1 = 145
            temp = temp/ 10; // 145/10 = 14
        }
        if(specialSum == i){
            System.out.println( i);
        }
    }
    }
}
