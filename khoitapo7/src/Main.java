public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "Toyota", 5, 2018);
        System.out.println(c1);
        System.out.println("Tuổi thọ của xe: " + c1.getAge() + " năm");
    }
}
