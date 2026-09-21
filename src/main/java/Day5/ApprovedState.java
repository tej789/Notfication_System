package Day5;

public class ApprovedState implements ApprovalState{


    private ApprovalRequest request;

    public ApprovedState(ApprovalRequest request){
        this.request = request;
    }

    @Override
    public void approve() {
        System.out.println("Already Approved");
    }

    @Override
    public void reject() {
        System.out.println("Can Not Reject an already approved Request");
    }

    @Override
    public void resubmit() {
        System.out.println("Only Resubmit a Rejected request");
    }
}
