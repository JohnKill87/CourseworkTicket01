public class Main {
    public static void reverseCount(int[] name) {
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.print(name[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
    public static void main(String[] args) {
        int[] apples = {5, 10, 15, 20};
        reverseCount(apples);
    }
}
