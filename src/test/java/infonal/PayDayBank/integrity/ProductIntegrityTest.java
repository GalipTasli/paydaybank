package infonal.PayDayBank.integrity;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.mockito.Mockito;
import org.testng.annotations.Test;


import infonal.PayDayBank.dataAccess.abstracts.ProductDao;
import infonal.PayDayBank.entities.concretes.Product;

public class ProductIntegrityTest {
	@Test
	public void testAdd()
	{
		 final var productDao = Mockito.mock(ProductDao.class);
		    
		
		  
		    // Yeni bir entity üretelim
		    var product = new Product(1000,"dolap",9000,true,"dolap");

		   
		    // DB'ye insert yapalım
		    productDao.save(product);
		    // Insert yapmış olduğumuz entity'i geri okuyalım.
		    var testValueFromDb = productDao.getById(1000);

		   
		    // Şimdi ise gelen entity'deki content'in eşitliğini kontrol edelim	
		    assertSame(product, testValueFromDb);
	}

}
