package infonal.PayDayBank.integrity;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.mockito.Mockito;
import org.testng.annotations.Test;


import infonal.PayDayBank.dataAccess.abstracts.UserDao;
import infonal.PayDayBank.entities.concretes.User;

public class UserIntegrityTest {

	@Test
	public void testAdd()
	{
		 final var userDao = Mockito.mock(UserDao.class);
		    
		
		  
		    // Yeni bir entity üretelim
		    var user = new User(1000,"galip","galip","galip","galip");

		   
		    // DB'ye insert yapalım
		    userDao.save(user);
		    // Insert yapmış olduğumuz entity'i geri okuyalım.
		    var testValueFromDb = userDao.getById(1000);

		   
		    // Şimdi ise gelen entity'deki content'in eşitliğini kontrol edelim	
		    assertSame(user, testValueFromDb);
	}
}
