import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kí tự (N , S , E , W ):");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'N':
                System.out.println("Hướng Bắc ");
                break;
            case 'S':
                System.out.println("Hướng Nam ");
                break;
            case 'E':
                System.out.println("Hướng Tây ");
                break;
            case 'W':
                System.out.println("Hướng Đông ");
                break;
                default:
                    System.out.println("Kí tự không hợp lệ ");
        }
    }
}