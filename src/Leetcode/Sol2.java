package Leetcode;

import java.util.*;

public class Sol2 {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int m = worker.length;

        // Create a list of jobs
        List<int[]> jobs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jobs.add(new int[]{difficulty[i], profit[i]});
        }

        // Sort jobs by difficulty
        Collections.sort(jobs, (a, b) -> a[0] - b[0]);

        // Sort workers by their ability
        Arrays.sort(worker);

        int maxProfit = 0;
        int jobIndex = 0;
        int bestProfit = 0;

        // Iterate through each worker
        for (int ability : worker) {
            // Update the best profit the worker can achieve based on their ability
            while (jobIndex < n && jobs.get(jobIndex)[0] <= ability) {
                bestProfit = Math.max(bestProfit, jobs.get(jobIndex)[1]);
                jobIndex++;
            }
            maxProfit += bestProfit;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] difficulty = {85,47,57};
        int[] profit = {24,66,99};
        int[] worker = {40,25,25};

        System.out.println(maxProfitAssignment(difficulty, profit, worker)); // Output: 100
    }
}

