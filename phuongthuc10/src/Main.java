import java.util.Scanner;

public class Main {
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false; // Các số nhỏ hơn 2 không phải là số nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) { // Chỉ cần kiểm tra đến căn bậc hai của n
            if (n % i == 0) return false; // Nếu chia hết cho i thì không phải số nguyên tố
        }
        return true; // Nếu không chia hết cho số nào thì là số nguyên tố
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        if (laSoNguyenTo(n))
            System.out.println(n + " là số nguyên tố.");
        else
            System.out.println(n + " không phải là số nguyên tố.");
    }
}
