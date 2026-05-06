class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
       Set<List<Integer>> res = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int k =0-(nums[i]+nums[j]);
                if(hm.containsKey(k)){
                   List<Integer> arr =  new ArrayList<Integer>();
                   arr.add(nums[i]);
                   arr.add(nums[j]);
                   arr.add(k);
                   Collections.sort(arr);
                   res.add(arr);
                }
                else{
                    hm.put(nums[i],i);
                }
                
            }
        }

        return new ArrayList<>(res);
    }
}
