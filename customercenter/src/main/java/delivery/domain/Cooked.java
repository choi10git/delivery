package delivery.domain;

import delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Cooked extends AbstractEvent {

    private Long id;
    private Boolean accept;
    private String status;
    private Long orderId;
}
