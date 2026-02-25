class Solution {

    public void getAllPartitions(String s, List<List<String>> ans, List<String> partition) {
        if(s.length() == 0) { 
            ans.add(new ArrayList<>(partition));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String part = s.substring(0, i + 1);
            if(isPalindrome(part)) { 
                partition.add(part);
                getAllPartitions(s.substring(i+1, s.length()), ans, partition);
                partition.remove(partition.size()-1);
            }
            
        }
    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>(); 
        List<String> partition = new ArrayList<>(); 

        getAllPartitions(s, ans, partition); 

        return ans; 
    }
}