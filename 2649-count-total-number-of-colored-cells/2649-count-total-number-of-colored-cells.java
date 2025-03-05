class Solution {
    public long coloredCells(int n) {
        long sum = 0; 
        long count = 0; 
        if(n==1){ 
            return 1; 
        } else { 
            for(int i=1; i<n; i++){ 
                count = 4*i; 
                sum += count; 
            }
            return sum + 1;
        }
    }
}