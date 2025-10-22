
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Dog", "Brown", 5);
        Animal a2 = new Animal("Cat", "brown", 3);

        System.out.println(a1.toString());
        System.out.println("Năm sinh: " + a1.getYearOfBirth());

        System.out.println("Cùng màu với a2 không? " + a1.equalsColor(a2));

        a1.increaseAge();
        System.out.println("Tuổi sau khi tăng: " + a1.getAge());
    }
}
