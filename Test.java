import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String args[]){
    int x [] = {1,2,3,4};

    for(int k : x){
        System.out.println(k);
    }
    List<Integer> number = Arrays.asList(2,3,4,5);
    number =  number.stream().filter(x1 -> x1>2).map(x1->x1)        // fetching price  
     .collect(Collectors.toList());
    System.out.println(number.get(1));
}
}
