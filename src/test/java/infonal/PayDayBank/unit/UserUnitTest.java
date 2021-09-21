package infonal.PayDayBank.unit;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import infonal.PayDayBank.business.concretes.UserManager;
import infonal.PayDayBank.dataAccess.abstracts.UserDao;
import infonal.PayDayBank.entities.concretes.User;

public class UserUnitTest {
	@Test
	public void TestUserGetById() {
		final var userDao = Mockito.mock(UserDao.class);
		final var userManager = new UserManager(userDao);
		final var expectedResult = new User(1023, "nevin", "nevin@nevin", "2345", "nevinn");
		Mockito.doReturn(expectedResult).when(userDao).save(Mockito.any(User.class));

		final var actualResult = userManager.getByUserId(1023);

		assertSame(expectedResult, actualResult);
	}

	@Test
	public void TestGetAll() {
		final var userDao = Mockito.mock(UserDao.class);
		final var userManager = new UserManager(userDao);
		final var expectedResult = new User();
		Mockito.doReturn(expectedResult).when(userDao).save(Mockito.any(User.class));

		final var actualResult = userManager.getall();

		assertSame(expectedResult, actualResult);
	}

}
