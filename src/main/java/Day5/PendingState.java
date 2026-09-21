package Day5;

public class PendingState implements ApprovalState{

    private ApprovalRequest request;

    public PendingState (ApprovalRequest request){
        this.request = request;
    }

    @Override
    public void approve() {
        System.out.println("Approved");
request.setState(new ApprovedState(request));
    }



    @Override
    public void reject() {
        System.out.println("Rejected");
        request.setState(new RejectedState(request));
    }

    @Override
    public void resubmit() {
        System.out.println(" Only Resubmit a Rejected Request");
    }
}
