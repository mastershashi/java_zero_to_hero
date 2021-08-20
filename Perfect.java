public class Perfect {

    public static void main(String args[]){
        // WAP to check a number is perfect or not
        // 6 => 1,2,3, 6 = 1+2+3= 6
        // 6 / 2 = 0
        for(int j = 1; j <1000 ; j++){
        int x = j, sum =0;
        for( int i = 1; i < x ; i++){
            if((x % i) == 0){
                sum = sum + i;
            }
        }
        if( sum == j){
            System.out.println(x);
        }
    }

    }
    
}
