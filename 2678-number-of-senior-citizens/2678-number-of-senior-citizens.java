class Solution {
    public int countSeniors(String[] details) {
        int count=0; 

        for(int i=0; i<details.length; i++){
            String str = "" + details[i].charAt(11) + details[i].charAt(12);
            int age = Integer.parseInt(str); 

            if(age>60){
                count++;
            }
        }

        return count;
    }
}