package day56_polymorphism;

public class Circle extends Shape {

    double radius;


    @Override
    public double area() {
        return Math.PI * radius * radius;
       // Math.PI * Math.pow(radius,2)
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
/*Task
 create a abstract class class called Shape
        create abstracts:
            area, perimeter


    create a sub class of Shape: circle
        implements methods

    create an interface called hasVolume
        volume

    create a sub class of Shape: sphere
        implements hasVolume
        implement methods
 */