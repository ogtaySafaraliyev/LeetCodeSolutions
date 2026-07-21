package problems2;

public class LongestCycleInAGraph {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] visited = new int[n];
        int time = 1;
        int longest = -1;

        for(int i = 0; i < n; i++) {
            if (visited[i] != 0) continue; // already explored in a previous traversal

            int startTime = time; // marks where THIS traversal began
            int curr = i;

            while (curr != -1 && visited[curr] == 0) {
                visited[curr] = time;
                time++;
                curr = edges[curr];
            }

            // if curr landed on a node stamped during THIS traversal, we closed a cycle
            if (curr != -1 && visited[curr] >= startTime) {
                longest = Math.max(longest, time - visited[curr]);
            }
        }
        return longest;
    }
}
