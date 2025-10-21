import java.util.Scanner;

public class Main {
    public static int demUoc(int n) {
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // nếu i chia hết cho n
                dem++; // tăng số lượng ước
            }
        }
        return dem; // trả về tổng số ước
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
        } else {
            System.out.println("Số lượng ước của " + N + " là: " + demUoc(N));
        }
    }
}
