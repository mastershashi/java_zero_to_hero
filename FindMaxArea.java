public class FindMaxArea {

    public static void main(String args[]){
        // WAP to find the max area
        // [1,2,6,5,7] = 12
        // [6,9,3,4,5,8] = 32
        // [] = 0
        // [2] = 0
        int height[] = {1,2,6,5,7};
        // math -> brute force -> complexity  -> optimise -> further optimse 
        // 1-2 = -1
        // 2-1 = 1
        int maxArea = 0;
        int i = 0;
        int j = height.length -1;
        maxArea = 0;
        while(i < j){// o(n2) -> o(n)
            maxArea = Math.max(maxArea, Math.min(height[i],height[j]) *(j-i));
            if(height[i] < height[j]){
                i++;
             }else{
                j--;
            }
        }
        System.out.println("Max area = " + maxArea);
    }
    
}
