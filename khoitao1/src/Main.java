import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.setMssv("1871020073");
        s1.setAge(20);
        s1.setName("Đồng Đỗ Bảo");

        Student s2 = new Student("1873773","bố đây con",99);

System.out.println(s1.toString());
System.out.println(s2.toString());
   }
}