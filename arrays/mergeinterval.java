import java.util.*;


public class mergeinterval{
    public static void main(String[] args){
        int[][] intervals =  {{1,5},{3,6},{8,10},{15,18}};
        int[][] ans = merge(intervals);
        System.out.println(Arrays.deepToString(ans));


    }

    static int[][] merge(int[][] intervals){
        List<int[]> ans = new ArrayList<>();
        int n= intervals.length;
        for(int i=0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(!ans.isEmpty() && end <= ans.get(ans.size() -1)[1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(intervals[j][0] <=end){
                    end = Math.max(end,intervals[j][1]);
                }else{
                    break;
                }
            }
            ans.add(new int[]{start,end});
        }
        return ans.toArray(new int[ans.size()][]);
    }

    // opimal approach



}