import java.util.Scanner;

public class Main {
    // Phương thức lấy chữ số cuối cùng của một số nguyên
    public static int getLastDigit(int n) {
        return Math.abs(n % 10); // Dùng Math.abs để luôn trả về số dương
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        System.out.println("Chữ số cuối cùng của " + n + " là: " + getLastDigit(n));
    }
}
