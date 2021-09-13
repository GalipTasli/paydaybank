package infonal.PayDayBank.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

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
import infonal.PayDayBank.entities.dtos.UserDto;
import infonal.PayDayBank.entities.dtos.Verification;

@Service
public class UserManager implements UserService {
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;

	}

	@Override
	public DataResult<List<UserDto>> getall() {

		List<UserDto> userdto = ((List<User>) userDao.findAll()).stream().map(this::convertToUserDto)
				.collect(Collectors.toList());
		return new SuccessDataResult<List<UserDto>>(userdto, "data listelendi");

	}

	@Override
	public Result add(UserDto userDto) {

		this.userDao.save(convertToUser(userDto));
		return new SuccessResult("kayıt başarılı");
	}

	@Override
	public Result updateUser(UserDto userDto) {

		userDao.deleteById(convertToUser(userDto).getId());
		userDao.save(convertToUser(userDto));
		return new SuccessResult("günceleme başarıı");

	}
//  istemciye göndereceğiniz verilerin şeklini değiştirmek isteyebilirsiniz burdada mail ve şifre sorgulmasını  yapmak için değişkenlerimizi verification türünden işleme sokuyoruz.
	@Override
	public Result verificationEmailandPassword(Verification verification) {

		if (userDao.findByEmailAddressAndPassword(convertToUser(verification).getEmailAddress(),
				convertToUser(verification).getPassword()) != null) {
			return new SuccessResult("kayıt bulundu");
		} else {
			return new ErrorResult("kayıt bulunamadı");
		}

	}

	@Override
	public DataResult<UserDto> getByUserId(int id) {
		User user = userDao.findById(id);
		UserDto userDto = convertToUserDto(user);

		return new SuccessDataResult<UserDto>(userDto, "data listelendi");
	}

	@Override
	public Result delete(int id) {
		userDao.deleteById(id);
		return new SuccessResult("silme başarılı");
	}
	//user değişkenide gelen verileri userdto değişkenine çeviren method.
	private UserDto convertToUserDto(User user) {
		UserDto userdto = new UserDto();
		userdto.setId(user.getId());
		userdto.setName(user.getName());
		userdto.setEmailAddress(user.getEmailAddress());
		userdto.setPassword(user.getPassword());
		userdto.setTitle(user.getTitle());
		return userdto;
	}
	//userdto değişkenide gelen verileri user değişkenine çeviren method.
	private User convertToUser(UserDto userDto) {
		User user = new User();
		user.setEmailAddress(userDto.getEmailAddress());
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		user.setTitle(userDto.getTitle());
		return user;
	}
	//verification değişkininde gelen verileri user değişkenine çeviren method.
	private User convertToUser(Verification verification) {
		User user = new User();
		user.setEmailAddress(verification.getEmailAddress());
		user.setPassword(verification.getPassword());
		return user;
	}

}
