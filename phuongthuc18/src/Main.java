import java.util.Scanner;

public class Main {
    // Phương thức lấy chữ số đầu tiên của một số tự nhiên
    public static int getFirstDigit(int n) {
        while (n >= 10) {  // Lặp cho đến khi n chỉ còn 1 chữ số
            n = n / 10;    // Mỗi lần chia 10 để bỏ chữ số cuối
        }
        return n; // Khi n < 10 thì n chính là chữ số đầu tiên
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Vui lòng nhập số tự nhiên (>= 0).");
        } else {
            System.out.println("Chữ số đầu tiên của " + n + " là: " + getFirstDigit(n));
        }
    }
}
