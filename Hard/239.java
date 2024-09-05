class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans = new int[n-k+1];
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int i=0;i<k;i++){
            q.offer(new int[]{nums[i],i});
        }
        ans[0]=q.peek()[0];
        for(int i=k; i<n ; i++){
            q.offer(new int[]{nums[i],i});
            while (q.peek()[1] <= i - k) {
                q.poll();
            }
            ans[i-k+1]=q.peek()[0];
        }
        return ans;
    }
}