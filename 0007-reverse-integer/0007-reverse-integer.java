class Solution {
    public int reverse(int x) {
        int revNum = 0;
        while(x!=0){
            //modular give the lastd digit of x
            int lastD = x%10;
            //check edge case for not limit exceed
            if(revNum>Integer.MAX_VALUE/10){
                return 0;
            }
            if(revNum<Integer.MIN_VALUE/10){
                return 0;
            }
            //multiply with 10 and add then last digit 
            revNum = (revNum*10)+lastD;
            
            x = x/10;
        }
       return revNum; 
    }
}