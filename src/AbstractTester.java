public class AbstractTester {

    public static void main(String[] args) {
        Shape s = new Rectangle();
        ((Rectangle)s).setLength(6);
        ((Rectangle)s).setWidth(4);

    }
}

abstract class Shape {
    private String kolor;
    abstract double getArea();

}

class Rectangle extends Shape{

    private int length;
    private int width;

    @Override
    double getArea() {
        return length*width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
