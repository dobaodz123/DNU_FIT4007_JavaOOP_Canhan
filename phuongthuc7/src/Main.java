import java.util.Scanner;

public class Main {

    public static void xinChao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String ten = sc.nextLine();
        System.out.println("Hello " + ten + "!");
    }

    public static void main(String[] args) {
        xinChao();
    }
}
