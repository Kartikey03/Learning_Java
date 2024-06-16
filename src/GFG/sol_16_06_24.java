package GFG;
import java.util.Arrays;

public class sol_16_06_24 {

    public static int[] findPrimePair(int n) {
        if (n < 2) {
            return new int[]{-1, -1};
        }

        // Step 1: Sieve of Eratosthenes to find all primes <= n
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Step 2: Find the prime pair
        for (int a = 2; a <= n; a++) {
            if (isPrime[a] && n - a > 1 && isPrime[n - a]) {
                return new int[]{a, n - a};
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(Arrays.toString(findPrimePair(10))); // Output: [3, 7]
        System.out.println(Arrays.toString(findPrimePair(3)));  // Output: [-1, -1]
    }
}
