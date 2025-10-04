import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào điểm số :");
        double score = sc.nextInt();
        if (score >= 0 && score <= 10) {
            System.out.println("điểm số hợp lý");
        }
        else{
            System.out.println("Điểm không hợp lý mất rồi thử lại nhé :");
        }

    }
}