public class Main {
    public static void main(String[] args) {
        String[][] input = {{"cat", "shark", "cactus"}, {"cat", "shark", "cactus"}};
        byte[] bytes = CSV.compress(input);
        System.out.println(CSV.uncompress(bytes));
    }
}
