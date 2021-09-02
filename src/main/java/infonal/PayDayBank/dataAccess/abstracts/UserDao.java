package infonal.PayDayBank.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import infonal.PayDayBank.entities.concretes.User;

public interface UserDao  extends JpaRepository<User, Integer> {
	
	
	User findById(int id);
	User findByEmailAddressAndPassword(String email,String password);




	 

}

