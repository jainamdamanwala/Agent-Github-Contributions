// Minimum Window Substring
// Difficulty: Hard
// URL: https://leetcode.com/problems/minimum-window-substring/

public int minOperations(int s, int t) {
    if (s >= t) return 0;
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(s);
    int operations = 0;
    while (!queue.isEmpty()) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int apples = queue.poll();
            if (apples == t) return operations;
            for (int[] pair : new int[][] {{-1, 1}, {1, -1}}) {
                int newApples = apples + pair[0];
                if (newApples >= 0 && newApples <= t) queue.offer(newApples);
            }
        }
        operations++;
    }
    return -1;
}