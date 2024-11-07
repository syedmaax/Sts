class LongestSequence {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int flips=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                flips++;
            }
            while(flips>k){
                if(nums[i]==0){
                    flips--;
                }
                i++;
            }
            max=Math.max(j-i+1,max);
        }
        return max;
    }
}