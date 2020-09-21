package shape;

public class Square extends Rectangle {
protected double side;

    public Square() {
        this.filled = false;
        this.color = "blue";
        side=1;
    }
    public Square(double side) {
      this.side=side;
        this.filled = false;
        this.color = "blue";
    }
    public Square(double side, String color, boolean filled) {
        this.side=side;
        this.filled = filled;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "color=" + color +
                "filled=" + filled +
                '}';
    }
}
