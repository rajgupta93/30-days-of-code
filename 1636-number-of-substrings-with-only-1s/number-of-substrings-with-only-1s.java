class Solution {


     int numSub(String s) {
        long ans =0;
        final int MODULO = 1000000007;
        int currLength = 0;
        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                currLength++;
            } else {
                 
                 ans = ans + ((1 + (long) currLength) * currLength ) / 2;
                 ans = (ans % MODULO);
                 currLength = 0;
               
            }

        }
           
         ans = ans + ((1 + (long) currLength) * currLength ) / 2;
         ans =   (ans % MODULO);

       

        return (int) ans;


    }
}