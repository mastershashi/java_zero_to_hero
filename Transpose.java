import java.util.Arrays;
import java.util.Collections;

public class Transpose {

    public static void main(String args[]){
        int arr[][] = {
            {1,1,1,1},
            {2,2,2,2},
            {3,3,3,3},
            {4,4,4,4}};
        for(int i =0 ;i< 4; i++){
            for(int j=i+1 ; j< 4; j++){
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i =0 ;i< 4; i++){
            for(int j=0 ; j< 4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }     
    }
    
}
