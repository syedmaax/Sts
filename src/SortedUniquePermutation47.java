import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        permu(ans, new ArrayList<>(), nums, new boolean[nums.length]);
        return ans;
    }
    private void permu(List<List<Integer>> ans, List<Integer> list, int[] nums, boolean[] arr) {
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
        } else {
            for(int i = 0; i < nums.length; i++) {
                if(arr[i] || i > 0 && nums[i] == nums[i-1] && !arr[i - 1]){
                    continue;
                }
                arr[i] = true;
                list.add(nums[i]);
                permu(ans, list, nums, arr);
                arr[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}