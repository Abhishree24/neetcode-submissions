class Solution {
    public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int goal = target - nums[i];
            if(hs.containsKey(goal)){
                if(i != hs.get(goal)) return new int[] {hs.get(goal), i};
                
            }
            else{
                hs.put(nums[i], i);
            }
        }
        return new int[]{};

    }
}
