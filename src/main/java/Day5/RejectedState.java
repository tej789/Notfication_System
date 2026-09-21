package Day5;

public class RejectedState implements ApprovalState{

    private ApprovalRequest request;

    public RejectedState(ApprovalRequest request) {
 this.request = request;

    }

    @Override
    public void approve() {
        System.out.println("Can not approve a rejected request");
    }

    @Override
    public void reject() {
        System.out.println("Already Rejected");

    }

    @Override
    public void resubmit() {
        System.out.println("Resubmit");
        request.setState(new PendingState(request));
    }
}
