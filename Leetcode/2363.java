import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] count = new int[1001];
        
        for (int[] item : items1) {
            count[item[0]] += item[1];
        }
        
        for (int[] item : items2) {
            count[item[0]] += item[1];
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (count[i] > 0) {
                result.add(Arrays.asList(i, count[i]));
            }
        }
        
        return result;
    }
}