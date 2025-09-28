import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 2 số nguyên
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        // Tính toán
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        // Thương có thể ra số thực nên dùng double
        double thuong = (b != 0) ? (double) a / b : Double.NaN;

        // In kết quả
        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);

        if (b != 0) {
            System.out.println("Thương: " + thuong);
        } else {
            System.out.println("Không thể chia cho 0");
        }

        sc.close();
    }
}
