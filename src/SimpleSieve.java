class Solution {
    public int countPrimes(int n) {
        int [] arr = new int[n+1];
        if(n==3){
            return 1;
        }
        for(int i=2;i*i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i*2;j<arr.length;j+=i){
                    arr[j]=1;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
}