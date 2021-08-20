package java_zero_to_hero;
public class CatchAThief {
    static int var ; 
    // WAP in Java to find unique number from array 
        public static void main(String args[]){
        int x[] = {10, 20,10,3,20}; // A^ A = 0, A^ 0 = A
        int number = 0;
        for(int i = 0; i< 5; i++){
            number = number ^ x[i];
            System.out.println(" number ^ x[i] = "+ number);
        }
        System.out.println("unique delivery id is  = "+ number);
        for(int n=0, m=10, i=5; n<m && n>i ; n++){}
        int sum = 0;
        for(int num = 145; num != 0; num = num/10){
            int digit = num%10;
            int fact = 1;
            while(digit != 0){
                fact = fact * digit;
                digit = digit - 1;
            }
            sum = sum + fact;
        }
    }
}
