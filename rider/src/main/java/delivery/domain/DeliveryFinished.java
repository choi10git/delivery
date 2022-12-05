package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryFinished extends AbstractEvent {

    private Long id;
    private Long foodId;
    private Long orderId;
    private String status;

    public DeliveryFinished(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryFinished(){
        super();
    }
}
