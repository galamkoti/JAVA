class Box
{
    double height;
    double width;
    double depth;
    Box(double height,double width,double depth)
    {
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    double getVolume()
    {
        return (height*depth*width);
    }
}
public class week4a {
    public static void main(String[] args)
    {
        Box b1=new Box(12.45,23.54,16.76);
        System.out.println("volume is="+b1.getVolume());
    }
}
