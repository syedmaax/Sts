import java.util.ArrayList;
import java.util.List;

class Combination77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        helper(1, list, res, n, k);
        return res;
    }

    private void helper(int start, List<Integer> list, List<List<Integer>> res, int n, int k) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i=start;i<=n;i++) {
            list.add(i);
            helper(i+1,list,res,n,k);
            list.remove(list.size() - 1);
        }
    }
}