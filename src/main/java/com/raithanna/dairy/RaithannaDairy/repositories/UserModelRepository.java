package com.raithanna.dairy.RaithannaDairy.repositories;
import com.azure.spring.data.cosmos.repository.Query;
import com.raithanna.dairy.RaithannaDairy.models.userModel;
import org.springframework.data.repository.CrudRepository;
public interface UserModelRepository extends CrudRepository<userModel, Integer> {
    @Query("select * from user_model where mobile=?1 and password=?2 ")
    userModel findByMobileAndPassword(String mobile, String password);
}
