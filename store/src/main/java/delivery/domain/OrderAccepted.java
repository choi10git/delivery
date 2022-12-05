package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private Boolean accept;
    private String status;
    private Long orderId;

    public OrderAccepted(Food aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}
