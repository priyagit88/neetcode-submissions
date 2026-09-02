class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int maxcount=0;
        int res=nums[0];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>maxcount){
                maxcount=entry.getValue();
                res=entry.getKey();
            }
        }
        return res;

        
    }
}