import java.util.Scanner;

public class JaggedArray{

    public static void main(String args[]){
        int x [][]= new int[4][];
        
        Scanner scan = new Scanner(System.in);
        int size[] = {3, 2, 5, 1 };
        int k=0;
        System.out.println("ENter elements:");
        for(int i =0 ; i < 4 ; i++){
            x[i] = new int[size[k]];
            for(int j=0; j< size[k] ; j++){
                x[i][j] = scan.nextInt(); 
            }
            k++;
        }
        System.out.println("Array Enter elements are:");
        k=0;
        for(int i =0 ; i < 4 ; i++){
            for(int j=0; j< size[k] ; j++){
                System.out.print(x[i][j] +" ");
            }
            k++;
            System.out.println();
        } 
    }
}