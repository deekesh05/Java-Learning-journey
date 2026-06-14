public class Area {
    int r;

    public Area(int r) {
        this.r = r;
    }

    double areaOfCircle()
    {
        return (Math.PI*r*r);
    }
    double circumferenceOfCircle()
    {
        return (2*Math.PI*r);
    }

    public static void main(String[] args) {
        Area area = new Area(5);
        System.out.println(area.areaOfCircle());
        System.out.println( area.circumferenceOfCircle());
    }
}
