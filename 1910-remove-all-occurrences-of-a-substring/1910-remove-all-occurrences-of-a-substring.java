class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(); 
        int m = part.length(); 

        for(char c : s.toCharArray()) { 
            sb.append(c); 

            if(sb.length() >=m) { 
                boolean match = true; 

                for(int i=0; i<m; i++) { 
                    if(sb.charAt(sb.length() - m + i) != part.charAt(i)) { 
                        match = false; 
                        break; 
                    }
                }

                if(match) { 
                    sb.delete(sb.length() - m, sb.length()); 
                }

            }

        }

        return sb.toString(); 
    }
}