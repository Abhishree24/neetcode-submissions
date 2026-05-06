class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            if(hs.containsKey(target-numbers[i])){
                return new int[] {hs.get(target-numbers[i])+1, i+1};
            }
            else{
                hs.put(numbers[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}
