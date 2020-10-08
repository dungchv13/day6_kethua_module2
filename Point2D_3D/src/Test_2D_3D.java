import asd.Point_2D;
import asd.Point_3D;
public class Test_2D_3D {
    public static void main(String[] args) {
        Point_2D test2D = new Point_2D();
        test2D.setXY(2.5f,3.4f);
        System.out.println(test2D.getXY().toString());
        System.out.println(test2D.display());

        Point_3D test3D = new Point_3D();
        test3D.setXYZ(5.1f,8.9f,5f);
        System.out.println(test3D.getXY().toString());
        System.out.println(test3D.display());
    }
}
