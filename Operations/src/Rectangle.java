public class Rectangle {
    private final int height;
    private final int width;

    public Rectangle(Point a, Point b) {
        this.height = Math.abs(a.y - b.y);
        this.width = Math.abs(a.x - b.x);
    }

    public int getArea() {
        return Math.abs(this.height * this.width);
    }

    public int getPerimeter() {
        return 2 * (this.height + this.width);
    }
}
