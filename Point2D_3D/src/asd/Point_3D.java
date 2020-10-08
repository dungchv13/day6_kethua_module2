package asd;

public class Point_3D extends Point_2D{
    private float z = 0.0f;
    public Point_3D(){}
    public Point_3D(float x,float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{this.x,this.y,this.z};
    }
    @Override
    public String display(){
        return "("+this.x+","+this.y+","+this.z+")";
    }


}
