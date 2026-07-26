class Solution {
    public boolean containsDuplicate(int[] nums) {
        //create set for store nums[i]
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
        
    }
}