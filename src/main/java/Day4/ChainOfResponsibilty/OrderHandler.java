package Day4.ChainOfResponsibilty;

public abstract class OrderHandler {

    protected  OrderHandler next;

    public void setNext(OrderHandler next){
        this.next = next;
    }

 public abstract boolean handle(Order order);
}
