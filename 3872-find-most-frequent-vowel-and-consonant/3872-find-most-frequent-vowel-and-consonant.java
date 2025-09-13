class Solution {
    public int maxFreqSum(String s) {
        String vowels = "aeiou";
        HashMap<Character, Integer> mapV = new HashMap<>(); 
        HashMap<Character, Integer> mapC = new HashMap<>(); 

        for(int i=0; i<s.length(); i++) { 
            if(vowels.indexOf(s.charAt(i))!=-1) { 
                mapV.put(s.charAt(i), mapV.getOrDefault(s.charAt(i), 0)+1);
            } else { 
                mapC.put(s.charAt(i), mapC.getOrDefault(s.charAt(i), 0)+1);
            }
        }

        int cons = 0, vow =0;
        for(char ch : mapV.keySet()) { 
            int freq = mapV.get(ch); 
            if(freq>vow) { 
                vow = freq; 
            }
        }

        for(char ch : mapC.keySet()) { 
            int freq = mapC.get(ch); 
            if(freq>cons) { 
                cons = freq; 
            }
        }

        return cons+vow;
    }
}