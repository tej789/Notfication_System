package Day5;

public class ApprovalRequest {

    private ApprovalState state;

    public ApprovalRequest(){
            state = new PendingState(this);}

public void setState(ApprovalState state){
        this.state = state;}

public void approve(){
        state.approve();
}

public void reject(){
        state.reject();
}
public void resubmit(){
        state.resubmit();
}

}
