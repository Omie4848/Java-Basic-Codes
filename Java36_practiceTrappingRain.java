public class Java36_practiceTrappingRain {
    public static void TrappingRainWater(int height[]){

        int n=height.length;
        int trappedWater=0;
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=(waterLevel-height[i]);
        }
 
        System.out.println(trappedWater);
        
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        TrappingRainWater(height);
    }
}
