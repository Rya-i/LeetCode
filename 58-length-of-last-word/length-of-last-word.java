class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim(); //remove spaces
        int count=0;
        for(int i=s.length()-1;i>=0;i--){ // loop starts from end 
            if(s.charAt(i)!=' '){ // if not space
                count++;
            }
            else{
                break;
            }
            
        }
        return count; // return count
        
    }
}