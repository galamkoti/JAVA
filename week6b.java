class figure3D
{
    void Area()
    {
        System.out.print("Area of figure 3D");
    }
    void Volume()
    {
        System.out.println("Volume of figure 3D");
    }
}
class sphere extends figure3D
{
    double r=50;
    double pi=3.14;
    void Area()
    {
        System.out.println("Area of cylinder ="+(4*pi*r*r));
    }
    void Volume()
    {
        System.out.println("Volume of Cylinder ="+((4*pi*r*r*r)/3));
    }
}
class cone extends figure3D
{
    double r=5;
    double pi=3.14;
    double slant_heit=20;
    double h=10;
    void Area()
    {
        System.out.println("Area of cone ="+(pi*r*slant_heit));
    }
    void Volume()
    {
        System.out.println("Volume of cone ="+((pi*r*r*h)/3));
    }
}
class cylinder extends figure3D
{
    double r=50;
    double pi=3.14;
    double heit=25;
    void Area()
    {
        System.out.println("Lateral surface Area of cylinder ="+(2*pi*r*heit));
    }
    void Volume()
    {
        System.out.println("Volume of Cylinder ="+(pi*r*r*heit));
    }
}
public class week6b {
    public static void main(String[] args)
    {
        figure3D[] f=new figure3D[3];
        cylinder a=new cylinder();
        sphere b=new sphere();
        cone c=new cone();
        f[0]=a;
        f[1]=b;
        f[2]=c;
        f[0].Area();
        f[0].Volume();
        f[1].Area();
        f[1].Volume();
        f[2].Area();
        f[2].Volume();
    }
}
