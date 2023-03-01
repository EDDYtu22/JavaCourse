public class ColoredCircle implements ColoredShape {

    private String color;
    private double radius;
    private static final double PI = 3.14;

    public ColoredCircle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public void tralala() {
        System.out.println("tralala");
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public String toString() {
        return color + " circle " + "with radius: " + radius;
    }

}
