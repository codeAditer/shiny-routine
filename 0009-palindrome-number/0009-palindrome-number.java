class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0)){
            return false;
        }

        int hrevNum = 0;
        while(x>hrevNum){
            int lD = x%10;
            hrevNum = (hrevNum*10)+lD;
            x = x/10;
        }
                return x == hrevNum || x == hrevNum / 10;
        
    }
}