package pack1;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    //contructor
    public Triangle(){}
    public Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //Get Set

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    //method
    public boolean isTriangle(){
        if(this.side1+this.side2 <= this.side3||this.side3+this.side2 <= this.side1||this.side1+this.side3 <= this.side2){
            return false;
        }else{
            return true;
        }
    }
    public double getArea(){
        if(this.isTriangle()) {
            return Math.sqrt((this.side1 + this.side2 + this.side3) * (this.side1 + this.side2 - this.side3)
                    * (this.side2 + this.side3 - this.side1) * (this.side3 + this.side1 - this.side2)) / 4;
        }else{
            return 0.0;
        }
    }
    public double getPerimeter(){
        if(this.isTriangle()) {
            return this.side1+this.side2+this.side3;
        }else{
            return 0.0;
        }

    }
    @Override
    public String toString(){
        if(this.isTriangle()) {
            return "do dai ba canh cua tam giac la: "+this.side1+", "+this.side2+", "+this.side3+", "
                    +"\ndien tich cua tam gian la: "+this.getArea()
                    +"\nchu vi cua tam giac la: "+this.getPerimeter();
        }else{
            return "day ko phai la tam giac";
        }

    }
}
