class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0, count = 0;

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            count = 0;

            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            i--;

            if (count == 1) {
                chars[idx++] = ch; 
            } else {
                chars[idx++] = ch;
                for (char num : String.valueOf(count).toCharArray()) {
                    chars[idx++] = num;
                }
            }
        }

        return idx;
    }
}