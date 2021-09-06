package infonal.PayDayBank.business.abstracts;

import java.util.List;

import infonal.PayDayBank.core.utilitis.results.DataResult;
import infonal.PayDayBank.core.utilitis.results.Result;
import infonal.PayDayBank.entities.concretes.Product;


public interface ProductService {
	DataResult<List<Product>> getall();
	Result add (Product product);
	Result updateProduct(Product product);
	DataResult<Product>getByProductId(int productId);
	Result delete(int id);

}