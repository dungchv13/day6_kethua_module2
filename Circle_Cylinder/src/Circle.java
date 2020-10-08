class Circle {
    private double raidus = 1.0;
    private String color = "black";

    //cotructor
    public Circle(){
    }
    //Get Set
    public void setColor(String color) {
        this.color = color;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }

    public String getColor() {
        return color;
    }

    public double getRaidus() {
        return raidus;
    }
    //method
    public double getArea(){
        return this.raidus*this.raidus*Math.PI;
    }

    public double getPerimeter(){
        return 2*this.raidus*Math.PI;
    }
    public String display(){
        return "hinh tron co ban kinh la: "+this.getRaidus()
                +"\ndien tich hinh tron la: "+this.getArea()
                +"\nban kinh hinh tron la: "+this.getPerimeter();
    }
}
class Cylinder extends Circle{
    private double height = 1.0;
    //contrutor
    public Cylinder(){
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolum(){
        return this.getArea()*this.height;
    }
    @Override
    public String display(){
        return "hinh tru co ban kinh la: "+this.getRaidus()
                +"\ndien tich hinh tru la: "+this.getArea()
                +"\nban kinh hinh tru la: "+this.getPerimeter()
                +"\nthe tich hinh tru la: "+this.getVolum();
    }
}


