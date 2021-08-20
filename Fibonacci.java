
public class Fibonacci {
    public static void main(String args[]){

        // 0 1 1 2  3   5   8 
        int a= 0, b= 1,c = 2, d =0;
        int n = 10;
        System.out.print(a + " " + b + " " + c);
        for(int i = 1; i<= (n-3); i++){
            d = a +b +c;
            System.out.print(" "+ d+ " ");
            a = b;
            b = c;
            c = d;
        }

        // 0    1   1   2   3   5 ...
        // 0    1   2   3   6  11   20  
        // PRINT THE TRIPPLE SEQUENCE OF FIBONNACI SERIES 
    }
    
}
