class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] map = new boolean[26];
        boolean canType = true;
        int result = 0;

        for(int i=0; i<brokenLetters.length(); i++) { 
            int index = brokenLetters.charAt(i) - 'a';
            map[index] = true;
        }

        for(int i=0; i<text.length(); i++) { 
            if(text.charAt(i) == ' ') { 
                if(canType) { 
                    result++;
                }
                canType = true;
            } else { 
                if(map[text.charAt(i)-'a'] == true) { 
                    canType = false;
                }
            }
        }

        if(canType) result++;

        return result;
    }
}