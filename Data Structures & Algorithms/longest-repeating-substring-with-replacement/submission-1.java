class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int max_length = 0;
        int max_freq = 0;
            int[] arr = new int[26];
        while(r<n){
            arr[s.charAt(r)- 'A']++;
            max_freq = Math.max(max_freq, arr[s.charAt(r)- 'A']);

                
                while ((r - l + 1) - max_freq > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
                
            
            max_length = Math.max(max_length, r-l+1);
           r++;
        }
         return max_length;
    }
}


// class Solution {
//     public int characterReplacement(String s, int k) {
//         int l = 0;
//         int r = 0;
//         int n = s.length();
//         int max_length = 0;
//         int max_freq = 0;
//         int[] arr = new int[26]; // Using int[] is safer for counts

//         while(r < n) {
//             // 1. Add current character to window
//             arr[s.charAt(r) - 'A']++;
            
//             // 2. Update the highest frequency in the current window
//             max_freq = Math.max(max_freq, arr[s.charAt(r) - 'A']);

//             // 3. Check if we need more than k replacements
//             // (Total Window Size - Count of Most Frequent Char)
//             while ((r - l + 1) - max_freq > k) {
//                 arr[s.charAt(l) - 'A']--;
//                 l++;
//             }
            
//             // 4. Update the answer
//             max_length = Math.max(max_length, r - l + 1);
            
//             // 5. Expand window
//             r++;
//         }
//         return max_length;
//     }
// }