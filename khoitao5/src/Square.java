public class Square {
    private double side;
    public Square (double side) {
        this.side = side;
    }
    public Square(){
        this.side = 1.0;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    // tính chu vi
    public double getPerimeter(){
        return 4 * side;
    }
    public double getArea(){
        return side * side;
    }
    public boolean isIntegerSquareSide() {
        return side == (int) side;
    }
    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }
}
