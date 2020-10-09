package pack1;

public class MovAblePoint extends PointClass {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    //contructor
    public MovAblePoint(){}
    public MovAblePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovAblePoint(float x,float y,float xSpeed,float ySpeed){
        this.setX(x);
        this.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    //Get Set

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    //method
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    @Override
    public String display(){
        return "(x,y)=("+this.getX()+","+this.getY()+"), speed(xSpeed,ySpeed) = ("+xSpeed+","+ySpeed+")";
    }
    public void move(){
        this.setX(this.getX()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
    }
}
