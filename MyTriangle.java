import javax.lang.model.util.ElementScanner14;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3)
    {
       this.v1 = new MyPoint(1, y1);
       this.v2 = new MyPoint(2, y2);
       this.v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint p1, MyPoint p2, MyPoint p3)
    {
        this.v1 = p1;
        this.v2 = p2;
        this.v3 = p3;

    }
    public String toString() {
       // return String.format("MyTriangle[v1=%s,v2=%s,v3=%s]", this.v1, this.v2, this.v3);
       // return ("MyTriangle[v1=(" + this.v1 + "), v2=(" + this.v2 + "), v3=(" + this.v3 + ")]");
        return("MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 );
     }
     public double getPerimeter()
     {
        double side1 = this.v1.distance(this.v2);
        double side2 = this.v2.distance(this.v3);
        double side3 = this.v3.distance(this.v1);

        return (side1+side2+side3);
     }
     public String getType()
     {
        double side1 = this.v1.distance(this.v2);
        double side2 = this.v2.distance(this.v3);
        double side3 = this.v3.distance(this.v1);

    if (side1==side2 && side2==side3)
       return "Equilateral";
    else if(side1==side2||side2==side3||side3==side1)
        return "Isosceles";
    else
        return "Scalene";
   }

}
