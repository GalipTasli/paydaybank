package infonal.PayDayBank.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import infonal.PayDayBank.business.abstracts.UserService;
import infonal.PayDayBank.core.utilitis.results.DataResult;
import infonal.PayDayBank.core.utilitis.results.Result;
import infonal.PayDayBank.entities.dtos.UserDto;
import infonal.PayDayBank.entities.dtos.Verification;
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
	public DataResult< List<UserDto>> getAll(){
		return this.userService.getall();
	}
	@GetMapping("/getByUserId")
	public DataResult<UserDto> getByUyserId(@RequestParam int id)
	{
		return this.userService.getByUserId(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody  UserDto userDto) {
		return this.userService.add(userDto); 
		
	}
	
	@PutMapping("/update")
	public Result updateUser(@RequestBody UserDto userDto){
		return this.userService.updateUser(userDto);
	}
	
	@PutMapping("/verify")
	public Result verificationEmailandPassword(@RequestBody Verification verification)
	{
		
		return this.userService.verificationEmailandPassword(verification);
	
	
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestParam int id)
	{
		return this.userService.delete(id);
	}
	
	
	
	
	
	
	

}
