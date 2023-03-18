package com.raithanna.dairy.RaithannaDairy.repositories;
import com.azure.spring.data.cosmos.repository.Query;
import com.raithanna.dairy.RaithannaDairy.models.customer;
import com.raithanna.dairy.RaithannaDairy.models.dailySales;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface CustomerRepository extends CrudRepository<customer,Integer> {
    @Query("select * from customer where code=?1 ")
    customer findByCode(String code);
    customer findTopByOrderByCustnoDesc();
    //@Query("select * from customer  order by id desc")


   // List<customer> findAllById();


    List<customer>  findByOrderByIdDesc();

}


