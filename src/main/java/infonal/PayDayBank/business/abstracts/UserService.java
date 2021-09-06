package infonal.PayDayBank.business.abstracts;

import java.util.List;

import infonal.PayDayBank.core.utilitis.results.DataResult;
import infonal.PayDayBank.core.utilitis.results.Result;
import infonal.PayDayBank.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getall();
	DataResult<User> getByUserId(int id);
	Result add (User user);
	Result verificationEmailandPassword(String email,String password);
	Result updateUser( User user);
	Result delete(int id);

}
