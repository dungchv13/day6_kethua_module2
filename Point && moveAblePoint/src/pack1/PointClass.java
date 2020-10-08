package pack1;

public class PointClass {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public PointClass(){

    }
    //Get Set
    public  PointClass(float x,float y){
        this.x = x;
        this.y = y;
    }

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
    //method
    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{this.x,this.y};
    }
    public String display(){
        return "(x,y)=("+this.x+","+this.y+")";
    }

}
