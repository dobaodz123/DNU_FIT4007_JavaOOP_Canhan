import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên A :");
        int A = sc.nextInt();
        System.out.print("nhập số nguyên B :");
        int B = sc.nextInt();

        System.out.print("nhập phép tinhs ( + , - , * , / , %):");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(A + " + " + B + " = " + (A + B));
                break;
            case'-':
                System.out.println(A+"-"+B+"= " + (A-B));
                break;
            case'*':
                System.out.println(A+"*"+B+"= " + (A*B));
                break;
            case '/':
                if (B != 0)
                    System.out.println(A + " / " + B + " = " + (A / B));
                else
                    System.out.println("Không thể chia cho 0!");
                break;
            case '%':
                if (B != 0)
                    System.out.println(A + " % " + B + " = " + (A % B));
                else
                    System.out.println("Không thể chia lấy dư cho 0!");
                break;
            default:
                System.out.println("Phép tính không hợp lệ!");

        }
    }
}