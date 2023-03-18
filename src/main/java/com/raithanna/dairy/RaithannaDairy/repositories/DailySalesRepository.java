package com.raithanna.dairy.RaithannaDairy.repositories;
import com.azure.spring.data.cosmos.repository.Query;
import com.raithanna.dairy.RaithannaDairy.models.dailySales;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DailySalesRepository extends CrudRepository<dailySales, Integer> {
    @Query("select * from daily_sales where order_no=?1")
    List<dailySales> findByOrderNo(Integer orderNo);
    @Query("select * from daily_sales where id=?1")
    dailySales findByid(Integer id);
    //@Modifying
    //@Query("UPDATE dailySales d set d.amount = :amount WHEREd.id = :id")
    //Integer setNameForId(@Param("amount") Double amount, @Param("id") Integer id);
    //int update(Double amount, Integer id);
}
