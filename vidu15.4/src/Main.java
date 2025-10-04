import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số a :");
        int a = sc.nextInt();
        System.out.print("nhập số b :");
        int b = sc.nextInt();
        if(a>b ){
            System.out.print("Số lớn hơn là : "+a);
        }
        else if (a<b ){
            System.out.print("Số lớn hơn là : "+b);
        }
        else{
            System.out.print("Hai số bằng nhau ");
        }
    }
}