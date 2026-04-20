// class Solution {
//     public int maxDistance(int[] colors) {
//         int r=Integer.MIN_VALUE;
//         for(int i=0;i<colors.length;i++)
//         {
//             for(int j=colors.length-1;j>i;j--)
//             {
//                 if(colors[i]==colors[j]) continue;
//                 int b=j-i;
//                 r=r>b?r:b;
//                 break;
//             }
//         }
//         return r;
//     }
// }
class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int i = 0, j = n - 1;
        
        while (colors[0] == colors[j]) j--;
        while (colors[n - 1] == colors[i]) i++;
        
        return Math.max(j, n - 1 - i);
    }
}
