package com.raithanna.dairy.RaithannaDairy.repositories;
import com.azure.spring.data.cosmos.repository.Query;
import com.raithanna.dairy.RaithannaDairy.models.customer;
import com.raithanna.dairy.RaithannaDairy.models.dailySales;
import com.raithanna.dairy.RaithannaDairy.models.saleOrder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
public interface SaleOrderRepository extends CrudRepository<saleOrder,Integer> {
    @Query("select * from sale_order where orderNo=?1")
    public saleOrder findByOrderNo(Integer orderNo);
    @Query("select * from sale_order where id=?1")
    saleOrder findByid(Integer id);
    saleOrder findTopByOrderByOrderNoDesc();
}
