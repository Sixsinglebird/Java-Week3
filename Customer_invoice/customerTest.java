public class customerTest {

  public static void main(String[] args) {
    Customer c1 = new Customer(0, "Alex", "Singleton");
    Invoice i1 = new Invoice(0, c1, 100.00);
    Account a1 = new Account(0, c1, 75.00);
    c1.setDiscount(0.15);

    System.out.println(c1);
    System.out.println(i1);
    System.out.println(a1);
  }
}
