import java.util.Scanner;

public class Main {
    public static boolean laDoiXung(String str) {
        String daoNguoc = new StringBuilder(str).reverse().toString();
        return str.equals(daoNguoc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        if (laDoiXung(s))
            System.out.println("Chuỗi đối xứng");
        else
            System.out.println("Chuỗi không đối xứng");
    }
}
