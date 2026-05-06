class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> result = new HashMap<String , List<String>>();
        for(int i=0;i<strs.length;i++){
            int[] count = new int[26];
            for(char c : strs[i].toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            if(!result.containsKey(key)){
                result.put(key, new ArrayList<>());
            }
                result.get(key).add(strs[i]);
            
            
        }
        return new ArrayList<>(result.values());
    }
}
