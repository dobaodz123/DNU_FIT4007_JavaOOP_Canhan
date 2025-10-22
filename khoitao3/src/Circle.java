public class Circle {
    private double radius ;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){
        this.radius = 0;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;

    }

    public String  toString(){
        return "Circle [radius=" + radius + "]";
    }
}
