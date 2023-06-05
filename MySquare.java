public class MySquare {

  //add vertices
  private MyPoint p1;
  private MyPoint p2;
  private MyPoint p3;
  private MyPoint p4;

  //add constructors
  public MySquare() {
    this.p1 = new MyPoint(1, 1);
    this.p2 = new MyPoint(2, 2);
    this.p3 = new MyPoint(1, 2);
    this.p4 = new MyPoint(2, 1);
  }

  public MySquare(MyPoint p1, MyPoint p2) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = new MyPoint(0, 0);
    this.p4 = new MyPoint(0, 0);
    this.p3.setXY(p1.getX(), p2.getY());
    this.p4.setXY(p2.getX(), p1.getY());
  }

  public MySquare(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.p4 = p4;
  }

  //toString
  public String toString() {
    return String.format(
      "My square: [p1 =%s,p2 =%s, p3 =%s, p4 =%s] Area =[%s] Perimeter =[%s]",
      this.p1,
      this.p2,
      this.p3,
      this.p4,
      getArea(),
      getPerimeter()
    );
  }

  //perimeter and area methods
  public double getArea() {
    double length = this.p1.distance(this.p3.getX(), this.p3.getY());
    double width = this.p1.distance(this.p4.getX(), this.p4.getY());
    return length * width;
  }

  public Double getPerimeter() {
    double length = this.p1.distance(this.p3.getX(), this.p3.getY());
    double width = this.p1.distance(this.p4.getX(), this.p4.getY());
    return (length * 2) + (width * 2);
  }
}
