class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        // 1. Build the frequency map
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // 2. Create a list of the unique keys (the numbers)
        List<Integer> list = new ArrayList<>(hm.keySet());

        // 3. Sort the list by frequency in descending order
        // (b, a) gives descending; (a, b) gives ascending
        list.sort((a, b) -> hm.get(b) - hm.get(a));

        // 4. Extract the first k elements into an int array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
