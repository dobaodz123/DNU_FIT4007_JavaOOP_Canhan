import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int tong = 0;

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            // Kiểm tra chỉ số lẻ và giá trị chẵn
            if (i % 2 != 0 && a[i] % 2 == 0) {
                tong += a[i];
            }
        }

        System.out.println("Tổng các phần tử chẵn có chỉ số lẻ là: " + tong);

        sc.close();
    }
}
