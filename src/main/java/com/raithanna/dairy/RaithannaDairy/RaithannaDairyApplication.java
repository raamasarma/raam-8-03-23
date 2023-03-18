package com.raithanna.dairy.RaithannaDairy;
import com.raithanna.dairy.RaithannaDairy.models.dailySales;
import com.raithanna.dairy.RaithannaDairy.models.productMaster;
import com.raithanna.dairy.RaithannaDairy.repositories.DailySalesRepository;
import com.raithanna.dairy.RaithannaDairy.repositories.ProductMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@SpringBootApplication
@RestController
@Controller
public class RaithannaDairyApplication {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private ProductMasterRepository productMasterRepository;
	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(RaithannaDairyApplication.class, args);
		/*DailySalesRepository repository = context.getBean(DailySalesRepository.class);
		List<dailySales> findByOrderNo =repository.findByOrderNo(58);
		if(findByOrderNo.) {
			dailySales dailysales = findByOrderNo.get();
			System.out.println(repository);
		}*/

	}
//	@PostMapping("/productsmigrate")
//	public List<Map<String,Object>> productMigrate(@RequestBody Map productsMap) throws ParseException {
//		 System.out.println(productsMap.get("item"));
//		 List<Map<String,Object>> products = (List<Map<String, Object>>) productsMap.get("item");
//		 System.out.println(products);
//		 for(Map<String,Object> productMap:products) {
//			 productMaster product = new productMaster();
//			 product.mapToVariables(productMap);
//			 productMasterRepository.save(product);
//		 }
//		 return products;
//	}
}
