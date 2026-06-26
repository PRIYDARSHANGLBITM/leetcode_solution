class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>(); 
        int total = 1 << n;
        for (int j = 0; j < total; j++) {
            int gray = j ^ (j >> 1);
            result.add(gray);
        }
        return result;
    }
}