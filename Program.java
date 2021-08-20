

public class Program {
    public static void main(String args[]){
        int x1[] = {1,2,3,4,5};
        
        for(int j = 0; j< 5; j++){
            if( j == 3) 
            continue;
                System.out.print(x1[j]+" ");
        }
        System.out.println("Exit");
    }
}
