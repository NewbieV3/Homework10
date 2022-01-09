import java.util.Scanner;

public class ForEachDoWhile {
    public static void main(String[] args) {
        int[] arr;
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers of elements: ");
        a = in.nextInt();
        arr = new int[a];

        for (int element = 0; element < a; element++) {
            System.out.println("Enter element [" + element + "] = " + "(try to enter '100')");
            do {
                arr[element] = in.nextInt();
            } while (arr[element] != 100);
            System.out.println("Error...");
        }
    }
}



