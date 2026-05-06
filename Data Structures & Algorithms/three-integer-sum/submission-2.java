class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        HashSet<Integer> hm = new HashSet<>();
        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            hm.clear();

            for (int j = i + 1; j < nums.length; j++) {

                int k = -(nums[i] + nums[j]);

                if (hm.contains(k)) {

                    List<Integer> arr = new ArrayList<>();

                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(k);

                    Collections.sort(arr);

                    res.add(arr);
                }

                hm.add(nums[j]);
            }
        }

        return new ArrayList<>(res);
    }
}