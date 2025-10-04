import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên N :");
        int N = sc.nextInt();
        if(N% 2==0 ){
            System.out.println(N+"Là số chẵn ");

        }
        else{
            System.out.print(N+ " là số lẻ ");
        }
    }
}