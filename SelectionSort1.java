public class SelectionSort1 {

    public static  int[] returnArrayDataAfterSorting(int [] unSortedArray){
        for(int i=0; i< unSortedArray.length ; i++){
            int index = i;
            for(int j = i; j< unSortedArray.length ;j++){
                if(unSortedArray[j] < unSortedArray[index]){
                    int temp = unSortedArray[j];
                    unSortedArray[j] = unSortedArray [index];
                    unSortedArray[index] = temp;
            }
        }
        }
        return unSortedArray;
    }
        
    public static void main(String args[]){
        int unSortedArray[] ={4,7,8,3,10}; 
	    int sortedArray[] = returnArrayDataAfterSorting(unSortedArray); 
        for(int i=0;i<sortedArray.length;i++){ 
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
    
}
