import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Giới tính của bạn là gì(0:Nam , 1: Nữ , 2 : Khác) ");
        int gender = sc.nextInt();
        switch (gender) {
            case 0:
                System.out.println("Nam");
                break;
            case 1:
                System.out.println("Nữ");
                break;
            case 2:
                System.out.println("Khác");
                break;
                default:
                    System.out.println("Giá trị không hợp lệ! Vui lòng nhập 0, 1 hoặc 2.");

        }
    }
}