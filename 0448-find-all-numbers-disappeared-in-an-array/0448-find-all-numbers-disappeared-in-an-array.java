class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] freq = new int[nums.length+1]; 
        List<Integer> list = new ArrayList<>(); 

        for(int num: nums) { 
            freq[num]++;
        }

        for(int i=1; i<freq.length; i++) { 
            if(freq[i]==0) list.add(i);
        }

        return list; 
    }
}