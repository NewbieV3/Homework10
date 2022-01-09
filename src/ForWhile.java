public class ForWhile {
    public static void main(String[] args) {

        int[] array = {15, 33, 51, 85, 93, 120, 252, 358};
        for (int f : array) {
            while (f == 15 || f == 93 || f == 252)
                f /= 3;
            System.out.println(f);
        }
    }
}
