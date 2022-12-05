package delivery.domain;

import delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private String address;
    private Double pay;
    private Long qty;
    private String status;
}
