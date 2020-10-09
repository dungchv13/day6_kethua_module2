package asd;

public class Point_2D {
    private float x = 0.0f;
    private float y = 0.0f;
    //contrutor
    public Point_2D(){
    }
    public Point_2D(float x,float y){
        this.x = x;
        this.y = y;
    }
    //Get Set


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{this.x,this.y};
    }
    public String display(){
        return "("+this.x+","+this.y+")";
    }
}

