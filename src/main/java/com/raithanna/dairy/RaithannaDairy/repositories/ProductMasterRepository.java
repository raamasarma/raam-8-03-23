package com.raithanna.dairy.RaithannaDairy.repositories;
import com.azure.spring.data.cosmos.repository.Query;
import com.raithanna.dairy.RaithannaDairy.models.dailySales;
import com.raithanna.dairy.RaithannaDairy.models.productMaster;
import com.raithanna.dairy.RaithannaDairy.models.userModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.SortedSet;
public interface ProductMasterRepository extends JpaRepository<productMaster, Integer> {
//    @Query("select * from product_master where splcustcode=?1 ")
//    Iterable<productMaster> findByOrderBySplCustCodeAsc(String splcustcode);
List<productMaster> findAllByOrderByPNameAsc();
    //@Query("select * from product_master where unitRate=?1 and PCode=?2")
    @Query("select * from product_master where PCode=?1 and unitRate=?2 and splcustcode ='dropdown'")
    productMaster findByPCodeAndUnitRate(String PCode, Double unitRate);
    //@Query("select * from product_master where splcustcode=?1")
    //List<productMaster> productList(String splcustcode);

}
