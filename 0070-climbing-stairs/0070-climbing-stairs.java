class Solution{
    public int climbStairs(int n){
        if(n<=2){
            return n ;
        }
        int first =1;
        int second =2;
        for(int j=3;j<=n;j++){
            int current = first + second;
            first = second;
            second = current;
        }
        return second;
    }
}