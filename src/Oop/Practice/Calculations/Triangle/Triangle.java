package Oop.Practice.Calculations.Triangle;

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


}
