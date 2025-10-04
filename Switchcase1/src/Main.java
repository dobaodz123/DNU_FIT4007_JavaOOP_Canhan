import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâpj số từ không đến chín (0-9)");
        int n = sc.nextInt();
        switch (n) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("một ");
                break;
            case 2:
                System.out.println("Hai ");
                break;
            case 3:
                System.out.println("Ba ");
                break;
            case 4:
                System.out.println("four ");
                break;
            case 5:
                System.out.println("five ");
                break;
            case 6:
                System.out.println("six ");
                break;
            case 7:
                System.out.println("seven  ");
                break;
            case 8:
                System.out.println("eight ");
                break;
            case 9:
                System.out.println("nine ");
                break;
            default:
                System.out.println("Số không hợp lệ! Vui lòng nhập số từ 0 đến 9.");


        }
    }
}