public class CircumferenceOfCircle {
    public double circumOfCircle(int radius)
    {

        return 2*Math.PI*radius ;
    }
    public static void main(String[] args) {
        CircumferenceOfCircle coc = new CircumferenceOfCircle();
        System.out.println(coc.circumOfCircle(5));
    }
}
