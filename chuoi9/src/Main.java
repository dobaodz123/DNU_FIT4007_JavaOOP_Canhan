import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        // Chuyển chuỗi về dạng thường để phân biệt hoa - thường tùy bạn
        s = s.toLowerCase();

        // Duyệt từng ký tự và đếm số lần xuất hiện
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Bỏ qua nếu ký tự đã được đếm rồi (thông qua ký tự '\0')
            if (c == '\0') continue;

            int count = 1;

            // So sánh ký tự hiện tại với các ký tự phía sau
            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    count++;
                    // Đánh dấu ký tự đã đếm
                    s = s.substring(0, j) + '\0' + s.substring(j + 1);
                }
            }

            System.out.println(c + " xuất hiện " + count + " lần");
        }
    }
}
