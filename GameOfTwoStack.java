public class GameOfTwoStack {
            private static int solve(int x, int[] a, int[] b, int i, int j, int sum) {
                if (sum > x) return -1;  // base case

                int ans = 0;

                // Option 1: take from a
                if (i < a.length) {
                    int takeA = 1 + solve(x, a, b, i + 1, j, sum + a[i]);
                    ans = Math.max(ans, takeA);
                }

                // Option 2: take from b
                if (j < b.length) {
                    int takeB = 1 + solve(x, a, b, i, j + 1, sum + b[j]);
                    ans = Math.max(ans, takeB);
                }

                return ans;
            }

            public static int twoStacks(int x, int[] a, int[] b) {
                return solve(x, a, b, 0, 0, 0);
            }

            public static void main(String[] args) {
                int[] a = {4, 2, 4, 6, 1};
                int[] b = {2, 1, 8, 5};
                int x = 7;

                System.out.println("Max elements: " + twoStacks(x, a, b));
            }
        }


