import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        // increasing curve
        for(int i=1; i<ratings.length; i++) { 
            if(ratings[i] > ratings[i-1]){ 
                candies[i] = candies[i-1] + 1;
            } 
        }


        // decreasing curve
        for(int i=ratings.length-1; i>=1; i--) { 
            if(ratings[i] < ratings[i-1]){ 
                candies[i-1] = Math.max(candies[i] + 1, candies[i-1]);
            }
        }

        int sum = 0; 
        for(int c : candies){
            sum += c;
        }

        return sum;
    }
}