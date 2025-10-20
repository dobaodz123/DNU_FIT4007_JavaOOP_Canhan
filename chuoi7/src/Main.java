import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi :");
        String chuoi = sc.nextLine();
        String chuoiinhoa =chuoi.toUpperCase(Locale.ROOT);
        System.out.println("chuỗi sau khi in hoa là :"+chuoiinhoa);
    }
}