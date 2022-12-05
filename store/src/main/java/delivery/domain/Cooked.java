package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Cooked extends AbstractEvent {

    private Long id;
    private Boolean accept;
    private String status;
    private Long orderId;

    public Cooked(Food aggregate){
        super(aggregate);
    }
    public Cooked(){
        super();
    }
}
