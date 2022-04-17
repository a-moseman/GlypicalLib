import java.nio.charset.StandardCharsets;

public class CSV {
    public static byte[] fieldToBytes(String field) {
        byte[] bytes = field.getBytes();
        return ArrayOperations.concatenate(new byte[]{(byte) bytes.length}, bytes);
    }

    public static byte[] rowToBytes(String[] row) {
        byte[] bytes = new byte[0];
        for (String field : row) {
            bytes = ArrayOperations.concatenate(bytes, fieldToBytes(field));
        }
        return ArrayOperations.concatenate(new byte[]{(byte) bytes.length}, bytes);
    }
}
