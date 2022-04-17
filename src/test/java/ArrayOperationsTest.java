import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {
    @Test
    void concatenateStringArray() {
        String[] a = {"1", "2", "3"};
        String[] b = {"4", "5", "6"};
        String[] c = {"1", "2", "3", "4", "5", "6"};
        assertArrayEquals(c, ArrayOperations.concatenate(a, b));
    }

    @Test
    void concatenateIntArray() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(c, ArrayOperations.concatenate(a, b));
    }

    @Test
    void concatenateLongArray() {
        long[] a = {1, 2, 3};
        long[] b = {4, 5, 6};
        long[] c = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(c, ArrayOperations.concatenate(a, b));
    }

    @Test
    void concatenateFloatArray() {
        float[] a = {1, 2, 3};
        float[] b = {4, 5, 6};
        float[] c = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(c, ArrayOperations.concatenate(a, b));
    }

    @Test
    void concatenateDoubleArray() {
        double[] a = {1, 2, 3};
        double[] b = {4, 5, 6};
        double[] c = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(c, ArrayOperations.concatenate(a, b));
    }

    @Test
    void concatenateByteArray() {
        byte[] a = {1, 2, 3};
        byte[] b = {4, 5, 6};
        byte[] c = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(c, ArrayOperations.concatenate(a, b));
    }

    @Test
    void concatenateBooleanArray() {
        boolean[] a = {true, false, true};
        boolean[] b = {false, true, false};
        boolean[] c = {true, false, true, false, true, false};
        assertArrayEquals(c, ArrayOperations.concatenate(a, b));
    }

    @Test
    void addIntArray() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {2, 4, 6};
        assertArrayEquals(c, ArrayOperations.add(a, b));
    }

    @Test
    void addLongArray() {
        long[] a = {1, 2, 3};
        long[] b = {1, 2, 3};
        long[] c = {2, 4, 6};
        assertArrayEquals(c, ArrayOperations.add(a, b));
    }

    @Test
    void addFloatArray() {
        float[] a = {1f, 2f, 3f};
        float[] b = {1f, 2f, 3f};
        float[] c = {2f, 4f, 6f};
        assertArrayEquals(c, ArrayOperations.add(a, b));
    }

    @Test
    void addDoubleArray() {
        double[] a = {1d, 2d, 3d};
        double[] b = {1d, 2d, 3d};
        double[] c = {2d, 4d, 6d};
        assertArrayEquals(c, ArrayOperations.add(a, b));
    }

    @Test
    void subtractIntArray() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {0, 0, 0};
        assertArrayEquals(c, ArrayOperations.subtract(a, b));
    }

    @Test
    void subtractLongArray() {
        long[] a = {1L, 2L, 3L};
        long[] b = {1L, 2L, 3L};
        long[] c = {0L, 0L, 0L};
        assertArrayEquals(c, ArrayOperations.subtract(a, b));
    }

    @Test
    void subtractFloatArray() {
        float[] a = {1f, 2f, 3f};
        float[] b = {1f, 2f, 3f};
        float[] c = {0f, 0f, 0f};
        assertArrayEquals(c, ArrayOperations.subtract(a, b));
    }

    @Test
    void subtractDoubleArray() {
        double[] a = {1d, 2d, 3d};
        double[] b = {1d, 2d, 3d};
        double[] c = {0d, 0d, 0d};
        assertArrayEquals(c, ArrayOperations.subtract(a, b));
    }

    @Test
    void multiplyIntArray() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 4, 9};
        assertArrayEquals(c, ArrayOperations.multiply(a, b));
    }

    @Test
    void multiplyLongArray() {
        long[] a = {1L, 2L, 3L};
        long[] b = {1L, 2L, 3L};
        long[] c = {1L, 4L, 9L};
        assertArrayEquals(c, ArrayOperations.multiply(a, b));
    }

    @Test
    void multiplyFloatArray() {
        float[] a = {1f, 2f, 3f};
        float[] b = {1f, 2f, 3f};
        float[] c = {1f, 4f, 9f};
        assertArrayEquals(c, ArrayOperations.multiply(a, b));
    }

    @Test
    void multiplyDoubleArray() {
        double[] a = {1d, 2d, 3d};
        double[] b = {1d, 2d, 3d};
        double[] c = {1d, 4d, 9d};
        assertArrayEquals(c, ArrayOperations.multiply(a, b));
    }
}