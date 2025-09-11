class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> sadUsers = new HashSet<>();

        int u,v;

        for(int i=0; i<friendships.length; i++) { 
            u = friendships[i][0]-1; 
            v = friendships[i][1]-1; 

            Set<Integer> langSetU = new HashSet<>();
            for(int lang : languages[u]) { 
                langSetU.add(lang);
            }

            boolean canTalk = false; 
            for(int lang : languages[v]) { 
                if(langSetU.contains(lang)){ 
                    canTalk = true; 
                    break;
                }
            }

            if(!canTalk) {
                sadUsers.add(u);
                sadUsers.add(v);
            }

        }

        Map<Integer, Integer> map  = new HashMap<>();
        for(int user : sadUsers) {
            for(int lang : languages[user]) {
                map.put(lang, map.getOrDefault(lang, 0)+1);
            }
        }

        int maxValue = 0;
        for(int value : map.values()) {
            maxValue = Math.max(maxValue, value);
        }

        return sadUsers.size() - maxValue;

    }
}