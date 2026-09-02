class Solution {
    public int maxSubArray(int[] nums) {

        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(currsum<0){
                currsum=0;
            }
            currsum=Math.max( nums[i],currsum + nums[i]);
            max=Math.max(currsum,max);
        }
        return max;
        
    }
}
