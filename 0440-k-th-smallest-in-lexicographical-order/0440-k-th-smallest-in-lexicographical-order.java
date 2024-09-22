class Solution{ 
    public int findKthNumber(int n, int k) {
        int curr =1;
        k--;
        while(k>0){
            int count = count(curr,curr+1,n);
            if(count <= k){ 
                curr++; 
                k-=count; 
            } else { 
                curr*=10; 
                k--;
            }
        }
        return curr; 
    }

    public int count(long curr, long next, int n){ 
        int countNum = 0; 
        while(curr <=n ){ 
            countNum += Math.min((long)n + 1, next) - curr; 
            curr *= 10; 
            next *= 10; 
        }
        return countNum; 
    }
}
