import java.util.Scanner;

public class Main {
    public static long tinhGiaiThua(int n) {
        long gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i; // nhân dồn
        }
        return gt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("Không tính được giai thừa cho số âm!");
        } else {
            System.out.println(N + "! = " + tinhGiaiThua(N));
        }
    }
}
