package infonal.PayDayBank.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infonal.PayDayBank.business.abstracts.UserService;
import infonal.PayDayBank.core.utilitis.results.DataResult;
import infonal.PayDayBank.core.utilitis.results.ErrorResult;
import infonal.PayDayBank.core.utilitis.results.Result;
import infonal.PayDayBank.core.utilitis.results.SuccessDataResult;
import infonal.PayDayBank.core.utilitis.results.SuccessResult;
import infonal.PayDayBank.dataAccess.abstracts.UserDao;
import infonal.PayDayBank.entities.concretes.User;


@Service
public class UserManager implements UserService {
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getall() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(User user) {
		
		this.userDao.save(user);
		return new  SuccessResult("kayıt başarılı");
	}

	@Override
	public Result updateUser(User user ) {
		
		
			userDao.deleteById(user.getId());
			userDao.save(user);
			return new SuccessResult("günceleme başarıı");
		
			
	}

	@Override
	public Result verificationEmailandPassword(String email, String password)
	{
		
		if(userDao.findByEmailAddressAndPassword(email, password)!=null)
		{
			return new SuccessResult("kayıt bulundu");
		}
		else
		{
			return new ErrorResult("kayıt bulunamadı");
		}
		

		
	}

	@Override
	public DataResult<User> getByUserId(int id) {
		return new SuccessDataResult<User>(this.userDao.findById(id),"data listelendi");
	}
	




	

}
