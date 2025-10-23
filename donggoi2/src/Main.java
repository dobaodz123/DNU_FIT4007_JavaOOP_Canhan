public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.setA(5);
        System.out.println("Trước khi tăng: " + obj.getA());

        obj.inc(); // được phép vì Main cùng package với A
        System.out.println("Sau khi tăng: " + obj.getA());
    }
}
