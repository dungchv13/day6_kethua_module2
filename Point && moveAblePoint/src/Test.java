import pack1.MovAblePoint;
import pack1.PointClass;

public class Test {
    public static void main(String[] args) {
        PointClass p1 = new PointClass(100f,100f);

        System.out.println("con tro 1");
        System.out.println(p1.display());

        MovAblePoint p2 = new MovAblePoint(200f,200f,10f,10f);
        System.out.println("con tro 2");
        System.out.println(p2.display());
        System.out.println("di chuyen con tro 2");
        p2.move();
        System.out.println(p2.display());
        System.out.println("thay doi speed cua con tro thanh 15/15 sau do di chuyen con tro 2 lan nua");
        p2.setSpeed(15f,15f);
        p2.move();
        System.out.println(p2.display());
    }
}
