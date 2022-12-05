package delivery.domain;

import delivery.domain.OrderAccepted;
import delivery.domain.Cooked;
import delivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Food_table")
@Data

public class Food  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Boolean accept;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private Long orderId;

    @PostPersist
    public void onPostPersist(){


        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();



        Cooked cooked = new Cooked(this);
        cooked.publishAfterCommit();

    }

    public static FoodRepository repository(){
        FoodRepository foodRepository = StoreApplication.applicationContext.getBean(FoodRepository.class);
        return foodRepository;
    }




    public static void order(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Food food = new Food();
        repository().save(food);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(food->{
            
            food // do something
            repository().save(food);


         });
        */

        
    }
    public static void cancel(OrderCancelled orderCancelled){

        /** Example 1:  new item 
        Food food = new Food();
        repository().save(food);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(food->{
            
            food // do something
            repository().save(food);


         });
        */

        
    }


}
