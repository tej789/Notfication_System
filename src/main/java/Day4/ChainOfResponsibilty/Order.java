package Day4.ChainOfResponsibilty;

public class Order {

private String product;
private String customerType;
private int quantity;
private boolean fraud;

   public Order(String product, String customerType, int quantity,boolean fraud ){
       this.customerType = customerType;
       this.product = product;
       this.quantity = quantity;
       this.fraud = fraud;
   }

   public String getProduct(){
       return product;
   }

   public String getCustomerType(){
       return customerType;
   }
   public int getQuantity(){
       return quantity;
   }

   public boolean isFraud(){
       return fraud;
   }

}
