class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int l = 0;
        int max = 0;

        int[] arr = new int[256];

        for (int r = 0; r < n; r++) {

            char ch = s.charAt(r);

            // duplicate found inside current window
            while (arr[ch] > 0) {
                arr[s.charAt(l)]--;
                l++;
            }

            arr[ch]++;
            
            int curr = r - l + 1;
            max = Math.max(max, curr);
        }

        return max;
    }
}