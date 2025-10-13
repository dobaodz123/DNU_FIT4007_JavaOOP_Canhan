import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // In phần tử đầu tiên và phần tử cuối cùng
        System.out.println("Phần tử đầu tiên: " + a[0]);
        System.out.println("Phần tử cuối cùng: " + a[n - 1]);

        sc.close();
    }
}
