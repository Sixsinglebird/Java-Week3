public class Invoice {

  private int id;
  private Customer customer;
  private double amount = 0.0;

  // Constructors
  public Invoice() {
    this.id = 0;
    this.customer = new Customer();
    this.amount += 0.0;
  }

  public Invoice(int id, Customer cust, double amount) {
    this.id = id;
    this.customer = cust;
    this.amount += amount;
  }

  public Invoice(int id, Customer cust) {
    this.id = id;
    this.customer = cust;
  }

  public int getId() {
    return this.id;
  }

  public Customer getCustomer() {
    return this.customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getCustomerName(Customer cust) {
    return cust.getName();
  }

  public double getAmountAfterDiscount() {
    return this.amount - (this.amount * this.customer.getDiscount());
  }

  public String toString() {
    return String.format(
      "amount $%s discount %s \n Amount after discount $%s",
      this.amount,
      this.customer.getDiscount(),
      this.getAmountAfterDiscount()
    );
  }
}
