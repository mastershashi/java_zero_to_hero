
public class Palin {
  

        public static void main(String args[]){
            // WAP to check a number is palindrom or not
            for( int j = 1; j < 1000 ; j++){
                int sum =0;
            for(int i = j ; i !=0; i = i/10){
                sum = sum* 10 + (i % 10);
            }
            if( j == sum){
                System.out.println(j);
            }
        }
        }
    
}
