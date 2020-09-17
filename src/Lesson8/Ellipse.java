package Lesson8;

import java.util.Objects;

public class Ellipse extends Circle{ // Если в родительском классе нет пусторого конструктора - наследования не получится
    private double radius2;

    public Ellipse() {
        super(); // super() означает использование родительского конструктора по умолчанию, но эта строка не пишется и не отображается.
    }

    public Ellipse(double radius, double radius2) {
        super(radius); // второй вариант this.setRadius()
        this.radius2 = radius2;
    }

    // если есть классы a->b->c, класс с наследует все методы, которые есть в b и те методы из a, которых нет в b

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ellipse)) return false;
        if (!super.equals(o)) return false;
        Ellipse ellipse = (Ellipse) o;
        return Double.compare(ellipse.radius2, radius2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius2);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "radius2=" + radius2 +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double perimeter() {
        double partUnderSqrt = (radius * radius + radius2 * radius2) / 2; // радиус виден из-за того, что переменная радиус в круге имеет модификатор доступа протектед

        return 2 * Math.PI * Math.sqrt(partUnderSqrt);


    }


}
