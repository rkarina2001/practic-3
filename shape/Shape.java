package shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape () {
        filled = false;
        color = "blue";
    }
    public Shape (String colour, boolean filled){
        this.color=colour;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colour) {
        this.color = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
