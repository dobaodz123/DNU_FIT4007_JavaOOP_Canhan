import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tên của bạn");
        String name = sc.nextLine();
        int length  = name.length();
        System.out.println("độ dài của tên bạn "+length);

    }
}