class Solution {
    public int maximum69Number (int num) {
        int pos=-1, index=0, temp=num;
        while(temp!=0) { 
            if(temp%10==6) { 
                pos = index;
            }
            temp /= 10;
            index++;
        }
        if(pos==-1) return num;

        return num + 3*(int)Math.pow(10,pos); 
    }
}