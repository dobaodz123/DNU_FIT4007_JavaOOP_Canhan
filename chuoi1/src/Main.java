import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập kí tự để đảo ngược :");
        String str  = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("chuỗi bị đảo ngươcj là :"+reversed);
        sc.close();
    }
}