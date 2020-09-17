package Lesson8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println("Длина окружности равна " +
                circle.perimeter() + "ед.\n");

        Ellipse ellipse = new Ellipse(3, 6);
        System.out.println("Длина овала равна " +
                ellipse.perimeter() + "ед.\n");


    }
}
