class MaxProductSubarray152 {
    public int maxProduct(int[] arr) {
        int n = arr.length;

        double previous = 1;
        double fromlast = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (previous == 0){
                previous = 1;
            }
            if (fromlast == 0){
                fromlast = 1;
            }
            previous*= (double)arr[i];
            fromlast*= (double)arr[n - i - 1];
            ans = (int)Math.max(ans, Math.max(previous,fromlast));
        }
        return ans;
    }
}
