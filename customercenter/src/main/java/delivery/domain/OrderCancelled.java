package delivery.domain;

import delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private Long foodId;
    private String address;
    private Double pay;
    private Long qty;
    private String status;
}
