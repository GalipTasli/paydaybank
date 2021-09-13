package infonal.PayDayBank.dataAccess.abstracts;
// JpaRepository'den gelen hazır metotlara/sorgulara ek olarak farklı sorgular ile kontroller gerçekleştirmek için isimlendirme kurallarına özen göstererek findBy metotlarımın imzalarını oluşturdum.

import org.springframework.data.jpa.repository.JpaRepository;


import infonal.PayDayBank.entities.concretes.User;

public interface UserDao  extends JpaRepository<User, Integer> {
	
	
	User findById(int id);
	User findByEmailAddressAndPassword(String email,String password);




	 

}

