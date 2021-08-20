public class Fib {
    public static void main(String args[]) {
        int a = 0, b =1 , c = 2;
            System.out.print(a + " " + b + " " + c);
        for (int i = 1; i <= (10-2);i++){
            int d = a + b + c;
            System.out.print(" "+ d +  " ");
            a = b;
            b = c;
            c = d;
        }
    System.out.println("");
 }
}
