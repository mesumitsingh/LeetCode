class Solution {
    public int majorityElement(int[] nums) {
    //     HashMap<Integer, Integer> map = new HashMap<>(); 
    //     int max = Integer.MIN_VALUE, result=-1; 

    //     for(int num : nums) { 
    //         map.put(num, map.getOrDefault(num, 0)+1);
    //     }

    //     for(Integer key : map.keySet()) { 
    //         Integer value = map.get(key); 
    //         if(value>max) { 
    //             max = value; 
    //             result = key; 
    //         }
    //     }

    //     return result;

    int freq=0, ans=0; 

    for(int i=0; i<nums.length; i++) { 
        if(freq==0) { 
            ans = nums[i]; 
        }

        if(ans==nums[i]) { 
            freq++; 
        } else { 
            freq--;
        }
    }

    return ans; 

    }
}