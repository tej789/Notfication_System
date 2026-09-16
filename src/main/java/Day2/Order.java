package Day2;
import java.util.List;

public class Order {

    private List<String> items;
    private String shippingAddress;
    private boolean giftWrap;
    private String discountCode;
    private String deliveryNotes;
    private boolean priorityFlag;


    private Order(Builder builder) {
        this.items = builder.items;
        this.shippingAddress = builder.shippingAddress;
        this.giftWrap = builder.giftWrap;
        this.discountCode = builder.discountCode;
        this.deliveryNotes = builder.deliveryNotes;
        this.priorityFlag = builder.priorityFlag;
    }

    public static class Builder{
        private List<String> items;
        private String shippingAddress;
        private boolean giftWrap;
        private String discountCode;
        private String deliveryNotes;
        private boolean priorityFlag;

        public Builder items(List<String> items){
            this.items = items;
            return this;
        }
        public Builder shippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder giftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public Builder discountCode(String discountCode) {
            this.discountCode = discountCode;
            return this;
        }

        public Builder deliveryNotes(String deliveryNotes) {
            this.deliveryNotes = deliveryNotes;
            return this;
        }

        public Builder priority(boolean priorityFlag) {
            this.priorityFlag = priorityFlag;
            return this;
        }

        public Order build() {

            if (items == null || items.isEmpty()) {
                throw new IllegalStateException(
                        "Order cannot be created: items are required"
                );
            }

            if (shippingAddress == null || shippingAddress.isBlank()) {
                throw new IllegalStateException(
                        "Order cannot be created: shipping address is required"
                );
            }

            return new Order(this);
        }


    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", giftWrap=" + giftWrap +
                ", discountCode='" + discountCode + '\'' +
                ", deliveryNotes='" + deliveryNotes + '\'' +
                ", priority=" + priorityFlag +
                '}';
    }

    public static void main(String[] args){

//        Order order = new Builder()
//                .items(List.of("Laptop", "Mouse"))
//                .shippingAddress("Ahmedabad, Gujarat")
//                .giftWrap(true)
//                .discountCode("SAVE10")
//                .deliveryNotes("Deliver after 5 PM")
//                .priority(true)
//                .build();

        Order order = new Order.Builder()
                .items(List.of("Laptop", "Mouse"))
                .shippingAddress("Ahmedabad")
                .giftWrap(true)
                .priority(true)
                .build();
        System.out.println(order);
    }
}
/*
Lombok's @Builder generates this Builder pattern for you, including the builder class,
chainable methods, and build() method, so you don't have to write all that boilerplate manually.
 You would still want to check business rules and required-field validation yourself,
 because @Builder by itself does not automatically know which fields your application considers
  valid or required.
 */