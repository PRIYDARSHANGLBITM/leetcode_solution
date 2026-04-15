class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int directDist = Math.abs(i - startIndex);
                int circularDist = n - directDist;
                int currDist = Math.min(directDist, circularDist);
                minDist = Math.min(minDist, currDist);
            }
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}