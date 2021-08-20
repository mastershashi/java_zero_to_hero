public class ReverseArray {

    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6,7,8,9};
        for(int i =0 ;i< (array.length/2); i++){
            int temp = array[array.length - i -1];
            array[array.length - i -1] = array[i];
            array[i] = temp ;
        }
        for(int i =0 ;i< array.length; i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    
}
