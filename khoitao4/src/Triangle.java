public class Triangle {
    private double sideA ;
    private double sideB;
    private double sideC;
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public Triangle(){
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;
    }
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    public double getArea() {
        double p = getPerimeter() / 2; // nửa chu vi
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }
    // thay đổi 3 cạnh
    public void set(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    // tính chu vi tam giác
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }
    public boolean isEquilateralTriangle() {
        return sideA == sideB && sideB == sideC;
    }

    // 🔹 Kiểm tra tam giác cân
    public boolean isIsoscelesTriangle() {
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }

    // 🔹 Kiểm tra tam giác vuông (định lý Pythagoras)
    public boolean isRightTriangle() {
        double[] sides = { sideA, sideB, sideC };
        java.util.Arrays.sort(sides); // sắp xếp cạnh tăng dần
        return Math.abs(sides[2] * sides[2] - (sides[0] * sides[0] + sides[1] * sides[1])) < 1e-6;
    }

    // 🔹 Ghi đè phương thức toString()
    @Override
    public String toString() {
        return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }
}
