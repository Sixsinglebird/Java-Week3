public class Account {

  private int id;
  private Customer customer;
  private double balance;

  public Account() {
    this.id = 0;
    this.customer = new Customer();
    this.balance = 0.0;
  }

  public Account(int id, Customer cust, double balance) {
    this.id = id;
    this.customer = cust;
    this.balance = balance;
  }

  public Account(int id, Customer cust) {
    this.id = id;
    this.customer = cust;
  }

  public int getId() {
    return this.id;
  }

  public Customer getCustomer() {
    return this.customer;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getCustomerName() {
    return this.customer.getName();
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    this.balance -= amount;
  }

  public String toString() {
    return String.format(
      "% % balance %",
      this.id,
      this.getCustomerName(),
      this.balance
    );
  }
}
