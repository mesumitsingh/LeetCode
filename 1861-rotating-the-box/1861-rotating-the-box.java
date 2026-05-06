class Solution {

    public char[][] rotateTheBox(char[][] box) {

        int m = box.length;
        int n = box[0].length;

        // Step 1: Move stones right
        for (int i = 0; i < m; i++) {

            int empty = n - 1;

            for (int j = n - 1; j >= 0; j--) {

                // obstacle
                if (box[i][j] == '*') {
                    empty = j - 1;
                }

                // stone
                else if (box[i][j] == '#') {

                    char temp = box[i][empty];
                    box[i][empty] = '#';
                    box[i][j] = temp;

                    empty--;
                }
            }
        }

        // Step 2: Rotate 90 degree clockwise
        char[][] ans = new char[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                ans[j][m - 1 - i] = box[i][j];
            }
        }

        return ans;
    }
}