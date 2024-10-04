class Solution {
    public int findNthDigit(int n) {
        int length=1,interval=9;
        while(n-interval>0){
            n-=interval;
            length++;
            interval=9*((int)Math.pow(10,length-1))*length;
            if(interval<0)break;
        }
        int num = ((int)Math.pow(10,length-1))+(n-1)/length;
        char c = String.valueOf(num).charAt((n-1)%length);
        return c-'0';
    }
}