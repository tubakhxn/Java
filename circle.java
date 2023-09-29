/* W.A.P in java to demonstrate multiple inheritance using interface.
Name:Tuba Khan
roll no:R2142221210
SAP ID: 500105642
Date:22/09/23 */

interface A{
    void center(int x, int y);
}
interface B{
    void length(int len);
}

class Circle implements A , B{
    int id;
    static int nextid=1;
    public Circle(int id){
        this.id = nextid++;    
    }

    int radius , a , b;

    public void center(int x, int y){
        this.a = x;
        this.b = y;
    }

    public void length(int len){
        this.radius = len;
    }

    public void Display(){
        System.out.println("Circle"+id+ ":");
        System.out.println("Center: (" + a + ", " + b + ")");
        System.out.println("Radius: " + radius);
        System.out.println();
    }
}


public class Circles{
    public static void main(String[] args){
        {
            Circle c1 = new Circle(1);
            Circle c2 = new Circle(2);
            

            c1.center(1,2);
            c2.center(3,4);

            c1.length(1);
            c2.length(2);

            c1.Display();
            c2.Display();

        }
    
}
}