package Day4.Observer;

import Day4.ChainOfResponsibilty.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderSubjects {

private List<OrderListener> listeners = new ArrayList<>();

public void addListener(OrderListener listener){
    listeners.add(listener);
}
public void removeListener(OrderListener listener){
    listeners.remove(listener);
}

public void notifyListeners(Order order){
    for(OrderListener listener : listeners){
        listener.update(order);
    }
}
}


