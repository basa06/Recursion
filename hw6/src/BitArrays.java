public class BitArrays {
    public static void main(String[] args) {
        final int N = 5; // Change this to 3 for 3-bit arrays
        int[] bits = new int[N];
        bit(bits, N);
    }

    static void bit(int[] array, int length) {
        if (length == 0) {
            System.out.println(java.util.Arrays.toString(array));
            return;
        }

        for (array[length - 1] = 0; array[length - 1] <= 1; array[length - 1]++) {
            bit(array, length - 1);
        }
    }
}
