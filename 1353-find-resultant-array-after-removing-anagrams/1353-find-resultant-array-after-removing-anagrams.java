class Solution {

    public boolean checkAnagram(String s1, String s2) { 
        int[] arr = new int[26];

        for(int i=0; i<s1.length(); i++) { 
            arr[s1.charAt(i)-'a']++;
        }

        for(int i=0; i<s2.length(); i++) { 
            arr[s2.charAt(i)-'a']--;
        }

        for(int i=0; i<arr.length; i++) { 
            if(arr[i]!=0) { 
                return false;
            }
        }
        return true;

    }

    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);
        int j=0; 

        for(int i=1; i<words.length; i++) { 
            if(!checkAnagram(list.get(j), words[i])) { 
                list.add(words[i]);
                j++;
            }
        }

        return list;
    }
}