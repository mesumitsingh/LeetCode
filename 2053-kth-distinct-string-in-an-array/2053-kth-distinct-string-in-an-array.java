class Solution {
    public String kthDistinct(String[] arr, int k) {
        int count; 
        
        for(int i=0; i<arr.length; i++){
            count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }

            if(count==1){
                k--;
            } 
            if(k==0){
                return arr[i];
            }
        }
        return "";
    }
}