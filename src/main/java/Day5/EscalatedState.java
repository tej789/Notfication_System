package Day5;

public class EscalatedState implements ApprovalState{

   private ApprovalRequest request;
    public EscalatedState (ApprovalRequest request){
        this.request = request;
    }

    @Override
    public void approve() {
        System.out.println("");

    }
    @Override
    public void reject() {
        System.out.println("");
    }

    @Override
    public void resubmit() {
        System.out.println("");
    }
}
