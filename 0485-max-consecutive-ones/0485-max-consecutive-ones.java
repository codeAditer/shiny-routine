class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxvisible = 0,counter=0;
        
        for(int num:nums){
            if(num == 1){
                counter++;
                
            }else{
                if(counter>maxvisible){
                    maxvisible=counter;
                }
                counter=0;
            }
        }
        return counter>maxvisible ? counter:maxvisible;
        
    }
}