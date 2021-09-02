package infonal.PayDayBank.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infonal.PayDayBank.business.abstracts.ProductService;
import infonal.PayDayBank.core.utilitis.results.DataResult;
import infonal.PayDayBank.core.utilitis.results.ErrorResult;
import infonal.PayDayBank.core.utilitis.results.Result;
import infonal.PayDayBank.core.utilitis.results.SuccessDataResult;
import infonal.PayDayBank.core.utilitis.results.SuccessResult;
import infonal.PayDayBank.dataAccess.abstracts.ProductDao;
import infonal.PayDayBank.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public DataResult<List<Product>> getall() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll());
	}
	@Override
	public Result add(Product product) {
		
		 this.productDao.save(product);
		 return new SuccessResult("ürün eklendi");
	}
	@Override
	public Result updateProduct(Product product) {
		if(product.getAvailable()==null||product.getDescription()==null|| product.getName()==null||product.getPrice()==0)
		{
			return new ErrorResult("lütfen bilgiler eksiksiz giriniz. ");
		}
		else
		{
			productDao.deleteById(product.getId());
			productDao.save(product);
			return new SuccessResult("günceleme başarılı");
		}
	}
	
	@Override
	public DataResult<Product> getByProductId(int productId) {
		return new SuccessDataResult<Product>
		(this.productDao.findById(productId),"Data listelendi");	
	}

}