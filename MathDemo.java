public class MathDemo {

    public static int min(int a, int b) { return (a < b) ? a : b; }
    public static int max(int a, int b) { return (a > b) ? a : b; }

    public static int sum(int[] args) {
        int total = 0;
        for (int n : args) total += n;
        return total;
    }

    public static float mean(int[] args) {
        if (args.length == 0) return 0;
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        int result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
}