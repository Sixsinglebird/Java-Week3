public class test {

  public static void main(String[] args) {
    MyPoint p1 = new MyPoint(1, 1);
    MyPoint p2 = new MyPoint(5, 5);
    MyPoint p3 = new MyPoint(1, 5);
    MyPoint p4 = new MyPoint(5, 1);
    MyPoint p5 = new MyPoint(8, 12);
    MyPoint p6 = new MyPoint(16, 64);

    // System.out.println(p1);

    // System.out.println(p1.distance(p2));
    // System.out.println(p1.distance());

    MySquare squareOne = new MySquare(p1, p2, p3, p4);
    System.out.println(squareOne);
    MySquare squareTwo = new MySquare(p1, p2);
    System.out.println(squareTwo);
    MySquare squareThree = new MySquare(p3, p4);
    System.out.println(squareThree);
    MySquare squareFour = new MySquare(p5, p6);
    System.out.println(squareFour);
  }
}
