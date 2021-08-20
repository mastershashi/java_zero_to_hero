package java_zero_to_hero;
import java.util.Scanner;
public class Greater {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three number \n");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int greater  = (x > y) && (x > z) ? x : (y > z)? y : z ;
        System.out.println("Greater number = " + greater);
    }
}
