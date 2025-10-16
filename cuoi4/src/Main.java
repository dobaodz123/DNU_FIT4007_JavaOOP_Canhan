import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String str = sc.nextLine();  // nhập nguyên dòng

        // Xóa khoảng trắng ở đầu và cuối chuỗi (nếu có)
        str = str.trim();

        // Nếu chuỗi rỗng sau khi xóa khoảng trắng → không có từ nào
        if (str.isEmpty()) {
            System.out.println("Số từ trong chuỗi là: 0");
        } else {
            // Tách chuỗi thành mảng các từ, ngăn cách bởi khoảng trắng
            String[] words = str.split(" ");

            System.out.println("Số từ trong chuỗi là: " + words.length);
        }

        sc.close();
    }
}
