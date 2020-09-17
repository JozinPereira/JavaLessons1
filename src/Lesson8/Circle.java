package Lesson8;

import java.util.Objects;

public class Circle {

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

// создать дерево типов данных: фигура (цвет + материал)
// прямоугольник, трапеция, квадрат, параллелограмм, неправильный 4-угольник
// задача: выстроить правильное взаимоотношения в дереве классов
// какой класс должен наследоваться из какого - решить самостоятельно
// дополнительные поля классов могут отличаться