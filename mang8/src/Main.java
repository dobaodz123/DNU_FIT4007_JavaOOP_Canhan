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

        // Bước 1: Giả sử phần tử đầu tiên là lớn nhất
        int max = a[0];

        // Bước 2: Tìm giá trị lớn nhất trong mảng
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        // Bước 3: Đếm số lượng phần tử có giá trị bằng max
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                count++;
            }
        }

        // Bước 4: In kết quả
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        System.out.println("Số lượng phần tử có giá trị lớn nhất là: " + count);

        sc.close();
    }
}
