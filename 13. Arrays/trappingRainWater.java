//Trapping Rain Water problem 


public class trappingRainWater
{
    public static int rainTrapping(int height[]){
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        
        int waterTrapped = 0;
        int n = height.length;
        
        left[0] = height[0];
        for (int i = 1; i<height.length; i++){
            left[i] = Math.max(left[i-1], height[i]);
        } 
        
        right[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        } 
        
        for(int i=0; i<height.length; i++){
            waterTrapped += Math.min(left[i], right[i]) - height[i];
        }
      
      return waterTrapped;
    } 
    
	public static void main(String[] args) {
	   //int[] height = {4,2,0,3,2,5};
      // int[] height = {4,2,0,6,3,2,5};
       int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
	    
	    
		System.out.println("Quantity Water trapped : " + rainTrapping(height));
	}
}
