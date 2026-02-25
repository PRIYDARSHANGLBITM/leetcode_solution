class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    int countA = Integer.bitCount(a);
                    int countB = Integer.bitCount(b);

                    if (countA == countB)
                        return a - b;

                    return countA - countB;
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}