package Triangle.Calculations;

public class Triangle {

    public int length, width, height;

    public Triangle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Triangle() {
        this.length = 3;
        this.width = 4;
        this.height = 5;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double area(){
        return length*width*height;

    }

    public double perimeter(){
        return length+width+height;

    }

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        Triangle shape = new Triangle(8,6,7);

        System.out.println("1.Area of triangle : " +tri.area());
        System.out.println("1.Perimeter of triangle : " +tri.perimeter());

        System.out.println("2.Area of triangle : " +shape.area());
        System.out.println("2.Perimeter of triangle : " +shape.perimeter());

        tri.setHeight(10);
        tri.setLength(17);
        tri.setWidth(5);

        System.out.println("3.Area of triangle : " +tri.area());
        System.out.println("3.Perimeter of triangle : " +tri.perimeter());



    }
}
