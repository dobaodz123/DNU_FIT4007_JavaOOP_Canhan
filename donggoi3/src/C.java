package mypackage;

public class C extends A {
    public C(int a) {
        super(a);
    }

    public void printSquare() {
        // Có thể dùng sqr() vì nó là protected
        System.out.println("Bình phương của a là: " + sqr());
    }
}
