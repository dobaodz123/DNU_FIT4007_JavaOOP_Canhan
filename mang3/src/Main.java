import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập N: ");
        int N = sc.nextInt();

        int[] a = new int[N]; // Khai báo mảng a có N phần tử

        // Nhập các phần tử của mảng
        for (int i = 0; i < N; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // In ra mảng theo thứ tự ngược lại
        System.out.print("Mảng in ngược: ");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
