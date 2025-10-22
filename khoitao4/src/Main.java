public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);

        System.out.println(t1.toString());
        System.out.println("Chu vi: " + t1.getPerimeter());
        System.out.println("Diện tích: " + t1.getArea());
        System.out.println("Tam giác đều: " + t1.isEquilateralTriangle());
        System.out.println("Tam giác cân: " + t1.isIsoscelesTriangle());
        System.out.println("Tam giác vuông: " + t1.isRightTriangle());
    }
}
