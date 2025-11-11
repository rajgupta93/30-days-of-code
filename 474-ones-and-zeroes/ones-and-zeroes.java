class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] memo = new int[strs.length][m+1][n+1];

        for(int i =0; i < strs.length; i++) {
            for(int j =0; j < m+1; j++) {
                for(int k=0; k < n+1; k++) {
                    memo[i][j][k] = - 1;
                }
            }    
        }
        
        return findMaxForm(strs,m,n,0, memo);
    }

    public int findMaxForm(String[] strs, int m, int n, int ind,int[][][] memo) {
        if(strs.length <= ind || m < 0 || n < 0) return 0;
        if (memo[ind][m][n] != -1) return memo[ind][m][n];

        int countZeros= 0, countOnes = 0;
        System.out.println(ind);
         for (char a : strs[ind].toCharArray()) {
            if(a == '0')
                countZeros++ ;
            else 
                countOnes++ ;
        }
    int take = 0;
        if(m >= countZeros && n >= countOnes) {
            take= 1+ findMaxForm(strs, m - countZeros, n - countOnes, ind + 1, memo);
        }

        
         return memo[ind][m][n]=Math.max(take, findMaxForm(strs, m , n , ind+ 1, memo));        
    }
}