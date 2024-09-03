class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ans[i]=arr[queries[i][0]];
            for(int I=queries[i][0]+1;I<=queries[i][1];I++)
                ans[i]^=arr[I];
        }
        return ans;
    }
}