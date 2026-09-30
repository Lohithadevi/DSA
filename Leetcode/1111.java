class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int arr[] = new int[seq.length()];
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int ao = 0;
        int bo = 0;
        for (int i = 0; i < seq.length(); i++) {
            char ch = seq.charAt(i);
            if (ch == '(') {
                if (ao <= bo) {
                    a.add(i);
                    ao++;
                } else {
                    b.add(i);
                    bo++;
                }
            } else {
                if (ao >= bo) {
                    a.add(i);
                    ao--;
                } else {
                    b.add(i);
                    bo--;
                }
            }
        }
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (p1 < a.size() && a.get(p1) == i) {
                arr[i] = 0;
                p1++;
            } else if (p2 < b.size() && b.get(p2) == i) {
                arr[i] = 1;
                p2++;
            }
        }

        return arr;
    }
}