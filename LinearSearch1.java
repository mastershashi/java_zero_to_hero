import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch1 {

    public static void main(String args[]){
        int arr[] = {1,4,5,6,29, 30, 47, 56 };
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to find in the array");
        int key = scan.nextInt();
        int first = 0;
        int last = arr.length -1;
        int mid = (first+last)/2;
        while(first <= last){
            if(key == arr[mid]){
                System.out.println(key + "found at index = " + mid);
                break;
            }else if(key > arr[mid]){
                first = mid +1 ;
            }
            else if(key < arr[mid]){
                last = mid -1;
            }
            mid = (first +last)/2;
        } 
        
    }
    
}
