import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long d = sc.nextLong();

        long[] pos = new long[n];
        int[] id = new int[n];

        for (int i = 0; i < n; i++) {
            pos[i] = sc.nextLong();
            id[i] = i + 1;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (pos[i] > pos[j]) {
                    long tempPos = pos[i];
                    pos[i] = pos[j];
                    pos[j] = tempPos;

                    int tempId = id[i];
                    id[i] = id[j];
                    id[j] = tempId;
                }
            }
        }

        int[] ans = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean ok = true;

            if (i > 0 && (pos[i] - pos[i - 1]) < d) {
                ok = false;
            }

            if (i < n - 1 && (pos[i + 1] - pos[i]) < d) {
                ok = false;
            }

            if (ok) {
                ans[count] = id[i];
                count++;
            }
        }

        Arrays.sort(ans, 0, count);

        System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.print(ans[i]);
            if (i < count - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

      
    }
}