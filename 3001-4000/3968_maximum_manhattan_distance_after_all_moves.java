class Solution {
    public int maxDistance(String moves) {
        int x = 0;
        int y = 0;
        int z = 0;

        for(char ch : moves.toCharArray()) {
            switch(ch) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case '_':
                    z++;
                    break;
            }
        }
        return Math.abs(x) + Math.abs(y) + z;
    }
}
