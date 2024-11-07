import java.util.ArrayList;
import java.util.Collections;

class Leadersgfg {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int leader = arr[arr.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(leader);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=leader){
                leader=arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
