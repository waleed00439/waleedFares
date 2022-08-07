public abstract class Circle {

   protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
public double getPerimeter(){

    return radius * radius;
}
public double getArea(){
        return radius;
}

    public abstract void resize(int percent);
}
