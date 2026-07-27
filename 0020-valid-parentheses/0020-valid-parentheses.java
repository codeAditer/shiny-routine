class Solution {
    public boolean isValid(String s) {
        //check if is even 
        if(s.length()%2 != 0) return false;
        //creata map for storing key value
          HashMap<Character, Character> map = new HashMap<>();
          map.put(')', '(');
         map.put('}', '{');
         map.put(']', '[');

         //initiate a stack 
         Stack<Character> stack = new Stack<>();
         for(char c: s.toCharArray()){
            
            if(map.containsKey(c)){ //closing bracket
                if(stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }
                
            }else{ //opening bracket
                    stack.push(c);
                }
         }

        return stack.isEmpty();
    }
}