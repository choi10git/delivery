package delivery.domain;

import delivery.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Pay_table")
@Data

public class Pay  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;


    public static PayRepository repository(){
        PayRepository payRepository = OrderApplication.applicationContext.getBean(PayRepository.class);
        return payRepository;
    }






}
