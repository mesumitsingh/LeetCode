import java.util.List; 
import java.util.ArrayList; 

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(); 
        int greatest = 0;
        for(int i=0; i<candies.length; i++){
            int addXtra = extraCandies + candies[i]; 
            greatest = 0; 
            for(int j=0; j<candies.length; j++){
                if(candies[j] > addXtra){
                    greatest = addXtra; 
                } 
            }
            if(greatest==0){
                result.add(true); 
            } else{
                result.add(false); 
            }
        }
    return result; 
    }
}