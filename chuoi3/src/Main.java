import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String str = sc.nextLine();  // nhập chuỗi từ bàn phím
        str = str.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Chuỗi là chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi không phải là chuỗi đối xứng.");
        }
        sc.close();
    }
}
