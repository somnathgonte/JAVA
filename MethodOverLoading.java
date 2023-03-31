public class MethodOverLoading
{
    static double area(double l,double b)
    {
        double area = l*b;
        return area;

    }
    static double area(double r)
    {
        double area = 3.14*r*r;
        return area;

    }
    public static void main(String []arg)
    {
        double length = 25.20,breadth=12.23,radius=26.45;
        System.out.println(area(length,breadth));
        System.out.println(area(radius));
    }
}