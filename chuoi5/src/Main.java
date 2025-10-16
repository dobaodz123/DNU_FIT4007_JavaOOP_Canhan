import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String str = sc.nextLine();  // nhập nguyên chuỗi

        boolean hasDigit = false;  // cờ kiểm tra có chữ số hay không

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) { // kiểm tra ký tự có phải số không
                hasDigit = true;
                break;  // chỉ cần tìm thấy 1 ký tự số là đủ
            }
        }

        // In kết quả
        if (hasDigit) {
            System.out.println("Chuỗi có chứa ít nhất một ký tự số.");
        } else {
            System.out.println("Chuỗi không chứa ký tự số nào.");
        }

        sc.close();
    }
}
