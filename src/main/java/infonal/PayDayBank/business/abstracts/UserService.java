package infonal.PayDayBank.business.abstracts;

import java.util.List;

import infonal.PayDayBank.core.utilitis.results.DataResult;
import infonal.PayDayBank.core.utilitis.results.Result;
import infonal.PayDayBank.entities.dtos.UserDto;
import infonal.PayDayBank.entities.dtos.Verification;

// İşlemleri datalar ile yapacağım için metot imzalarımı DataResult yapısında oluşturdum
public interface UserService {
	DataResult< List<UserDto>>  getall();
	DataResult<UserDto> getByUserId(int id);
	Result add (UserDto userDto);
	Result verificationEmailandPassword(Verification verification);
	Result updateUser( UserDto userDto);
	Result delete(int id);

}
