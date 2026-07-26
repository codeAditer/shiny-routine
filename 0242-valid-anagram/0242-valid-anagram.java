class Solution {
    public boolean isAnagram(String s, String t) {
        //check both length equals
        if(s.length() != t.length()) return false;

        //create array of 26
        int[] charCount =new int[26];

        for(int i = 0;i<s.length();i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) -'a']--;
        }
        for(int count:charCount){
            if(count != 0 ){
                return false;
            }
        }
        return true;


        
    }
}