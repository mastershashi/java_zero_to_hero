public class Insertion {

    public static void main(String args[]){
    
    int x[] = {6,9,3,4,5,0};
        int i = 0;
        int j = x.length -1;
        int target =  11;
    // Max area problem     
      /*  int maxArea = 0;
        while(i < j ){
            maxArea = Math.max(maxArea, Math.min(x[i],x[j]) * (j-i));
            if(x[i] < x[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(maxArea);*/
    // Two sum problem 
        while(i < j ){
            if(x[i] + x[j] == target){
                System.out.print(i + " "+ j);      
            }
            if(x[i] < x[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(); 
    }
}
