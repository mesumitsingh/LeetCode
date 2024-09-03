class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<s.length(); i++){
            sb.append(s.charAt(i)-'a'+1);
        }

        int sum=0; 
        for(int i=0; i<k; i++){
            sum=0;
            for(int j=0; j<sb.length(); j++){
                sum += Integer.parseInt(String.valueOf(sb.charAt(j)));
            }

            sb.setLength(0); 
            sb.append(String.valueOf(sum));
        }

        return sum; 

    }
}