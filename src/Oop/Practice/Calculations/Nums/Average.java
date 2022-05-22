package Oop.Practice.Calculations.Nums;

public class Average {
    public int one, two,three;
//    public double average;
//    public double sum;

    public Average(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;

    }
    public Average() {
        this.one = 5;
        this.two = 9;
        this.three = 2;

    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }

    public double add(){
        return one+two+three;
    }

    public double average(){
        return add()/3;
    }

}
