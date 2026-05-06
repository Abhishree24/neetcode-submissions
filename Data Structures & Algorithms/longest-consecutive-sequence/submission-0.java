class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        //int count =0;
        int max_count = 0;
        for(int i=0;i<nums.length;i++){
            if (!hs.contains(nums[i] - 1)) {
                int length = 1;
                while (hs.contains(nums[i] + length)) {
                    length++;
                }
                max_count = Math.max(max_count, length);
            }

        }

        return max_count;
    }
}
