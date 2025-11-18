class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i = 0; i < bits.length - 1; i++) {
            if(bits[i] == 0) continue;
            else {
                 if(i + 1 < bits.length - 1 ){
                    i++;
                 }else 
                 return false;   
            }
        }
        return true;
    }
}