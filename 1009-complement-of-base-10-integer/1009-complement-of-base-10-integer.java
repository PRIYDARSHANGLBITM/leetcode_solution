class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        binary=binary.replace('0','x') .replace('1','0') .replace('x','1');

        return Integer.parseInt(binary,2);
    }
}