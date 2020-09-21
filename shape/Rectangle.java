package shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        this.filled = false;
        this.color = "blue";
        length = 1;
        width=1;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
        this.filled = false;
        this.color = "blue";
    }
    public Rectangle(double width, double length, String color,boolean filled){
        this.width=width;
        this.length=length;
        this.filled = filled;
        this.color= color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    double getArea() {
        return length*width;
    }

    @Override
    double getPerimeter() {
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + this.width +
                ", length=" + this.length +  ", color=" + this.color+
                '}';
    }
}
