import java.util.Scanner;

public class Main {
    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số nguyên s1 :");
        int a = sc.nextInt();
        System.out.print("nhập số nguyên s2 :");
        int b = sc.nextInt();
        int tong = tinhTong(a, b);
        System.out.println("tổng là :" + tong);
        sc.close();

    }
}
