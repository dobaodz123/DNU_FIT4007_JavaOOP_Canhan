import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String str = sc.nextLine();  // đọc cả dòng văn bản

        int count = 0;  // biến đếm số ký tự 'a'

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }

        System.out.println("Số ký tự 'a' trong chuỗi là: " + count);

        sc.close();
    }
}
