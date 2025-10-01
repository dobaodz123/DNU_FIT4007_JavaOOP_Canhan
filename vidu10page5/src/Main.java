
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một ký tự thường (từ 'a' đến 'y'): ");
        char ch = sc.next().charAt(0); // lấy ký tự đầu tiên

        if (ch < 'a' || ch > 'y') {
            System.out.println("Ký tự không hợp lệ! Vui lòng nhập từ 'a' đến 'y'.");
            return;
        }

        char nextChar = (char) (ch + 1); // ký tự liền sau

        System.out.println("Ký tự liền sau '" + ch + "' là: " + nextChar);
    }
}
