import java.util.Stack;
public class LargestHistogram {

        public static int largestRectangleArea(int[] heights) {
            Stack<Integer> st = new Stack<>();
            int maxArea = 0;
            int n = heights.length;

            for (int i = 0; i <= n; i++) {
                int h = (i == n) ? 0 : heights[i]; // sentinel (0 at end)

                while (!st.isEmpty() && h < heights[st.peek()]) {
                    int height = heights[st.pop()];
                    int width = st.isEmpty() ? i : i - st.peek() - 1;
                    maxArea = Math.max(maxArea, height * width);
                }

                st.push(i);
            }

            return maxArea;
        }

        public static void main(String[] args) {
            int[] heights = {2, 1, 5, 6, 2, 3};
            System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights));
        }
    }

