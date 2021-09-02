package infonal.PayDayBank.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import infonal.PayDayBank.business.abstracts.UserService;
import infonal.PayDayBank.core.utilitis.results.DataResult;
import infonal.PayDayBank.core.utilitis.results.Result;
import infonal.PayDayBank.entities.concretes.User;
import io.swagger.v3.oas.annotations.parameters.RequestBody;



@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/getall")
	public DataResult<List<User>>getAll(){
		return this.userService.getall();
	}
	@GetMapping("/getByUserId")
	public DataResult<User> getByUyserId(@RequestParam int id)
	{
		return this.userService.getByUserId(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody  User user) {
		return this.userService.add(user); 
		
	}
	
	@PutMapping("/update")
	public Result updateUser(@RequestBody User user){
		return this.userService.updateUser(user);
	}
	
	@PutMapping("/verify")
	public Result verificationEmailandPassword(@RequestBody User user)
	{
		String email= user.getEmailAddress();
		String password= user.getPassword();
		return this.userService.verificationEmailandPassword(email,password);
	
	
	}
	
	
	
	
	
	

}
