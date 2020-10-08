public class TestCircle {
    public static void main(String[] args) {
        Circle cc1 = new Circle();
        cc1.setRaidus(10);
        System.out.println(cc1.display());
        Cylinder cL1 = new Cylinder();
        cL1.setRaidus(5);
        cL1.setHeight(10);
        System.out.println(cL1.display());
    }
}
