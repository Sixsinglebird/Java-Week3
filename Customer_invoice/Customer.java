public class Customer {

  private int id;
  private String firstName;
  private String lastName;
  private double discount;

  //   private String name = String.format("[%s %s]", this.firstName, this.lastName);

  //   constructors
  public Customer() {
    this.id = 0;
    this.firstName = "N/A";
    this.lastName = "N/A";
    this.discount = 0.0;
  }

  public Customer(int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.discount = 0.0;
  }

  public Customer(int id, String firstName, String lastName, int discount) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.discount = discount;
  }

  public int getId() {
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getName() {
    return this.firstName + " " + this.lastName;
  }

  public double getDiscount() {
    return this.discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public String toString() {
    return String.format(
      "%s %s %s %s",
      this.id,
      this.firstName,
      this.lastName,
      this.discount
    );
  }
}
