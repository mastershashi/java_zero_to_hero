

public class ArrayExplain {

    public static void main(String args[]){
        int x[][] = new int[3][];
        x[0] = new int[3];
        x[0] ={0,1,2};
        x[1] = new int[2];
        x[1] ={0,1};
        x[2] = new int[5];
        x[2] ={1,2,3,4,5};
        x[3] = new int[1];
        x[3] = {1};
        int size[] = {3, 2, 5, 1 };
        for(int i =0 ; i < 4 ; i++){
            for(int j=0; j<= 2 ; j++){
                System.out.println(x[i][j]);
            }
        } 
    }
}

