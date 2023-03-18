package com.raithanna.dairy.RaithannaDairy.repositories;
import com.raithanna.dairy.RaithannaDairy.models.prodType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface ProdTypeRepository extends CrudRepository<prodType, Integer> {
}
