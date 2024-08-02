class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiantQ = new LinkedList<>(); 
        Queue<Integer> direQ = new LinkedList<>();

        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i)=='R'){
                radiantQ.add(i);
            } else{
                direQ.add(i);
            }
        }

        while(!radiantQ.isEmpty() && !direQ.isEmpty()){
            int ri = radiantQ.peek(); 
            radiantQ.poll(); 
            int di = direQ.peek(); 
            direQ.poll(); 

            if(ri<di){
                radiantQ.add(ri + senate.length()); 
            } else{ 
                direQ.add(di + senate.length());
            }
        }
    
    return (radiantQ.size() > direQ.size())? "Radiant" : "Dire";
    }
}