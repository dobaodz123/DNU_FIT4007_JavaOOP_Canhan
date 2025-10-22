public class Main {
    public static void main(String[] args) {
        Square s1 = new Square();       // dùng constructor mặc định
        Square s2 = new Square(5.5);    // dùng constructor có tham số

        System.out.println(s1.toString());
        System.out.println("Diện tích: " + s1.getArea());
        System.out.println("Chu vi: " + s1.getPerimeter());
        System.out.println("Cạnh là số nguyên? " + s1.isIntegerSquareSide());

        System.out.println("----------------------");

        System.out.println(s2.toString());
        System.out.println("Diện tích: " + s2.getArea());
        System.out.println("Chu vi: " + s2.getPerimeter());
        System.out.println("Cạnh là số nguyên? " + s2.isIntegerSquareSide());
    }
}
