package day56_polymorphism;

public class Sphere extends Shape implements HasVolume {

    double radius;

    @Override
    public double volume() {
        return (4/3)* Math.PI * radius * radius * radius;//Math.pow(radius,3)
    }

    @Override
    public double area() {
        return Math.PI * 4 * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius ;
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
