package infonal.PayDayBank.dataAccess.abstracts;
// JpaRepository'den gelen hazır metotlara/sorgulara ek olarak farklı sorgular ile kontroller gerçekleştirmek için isimlendirme kurallarına özen göstererek findBy metotlarımın imzalarını oluşturdum.

import org.springframework.data.jpa.repository.JpaRepository;


import infonal.PayDayBank.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	 Product findById(int Id);
	

	  
	 

}
