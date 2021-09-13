package infonal.PayDayBank.business.concretes;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infonal.PayDayBank.business.abstracts.ProductService;
import infonal.PayDayBank.core.utilitis.results.DataResult;
import infonal.PayDayBank.core.utilitis.results.Result;
import infonal.PayDayBank.core.utilitis.results.SuccessDataResult;
import infonal.PayDayBank.core.utilitis.results.SuccessResult;
import infonal.PayDayBank.dataAccess.abstracts.ProductDao;
import infonal.PayDayBank.entities.concretes.Product;
import infonal.PayDayBank.entities.dtos.ProductDto;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	@Override
	public DataResult<List<ProductDto>> getall() {
		List<ProductDto> productDtos= ((List<Product> )productDao
				.findAll())
				.stream()
				.map(this::convertToProductDto)
					.collect(Collectors.toList());
		return new SuccessDataResult<List<ProductDto>>(productDtos,"data listelendi");
	}
	
	@Override
	public Result add(ProductDto productDto) {
		
		 this.productDao.save(convertToProduct(productDto));
		 return new SuccessResult("ürün eklendi");
	}
	
	@Override
	public Result updateProduct(ProductDto productDto) {
		
			productDao.deleteById(convertToProduct(productDto).getId());
			productDao.save(convertToProduct(productDto));
			return new SuccessResult("günceleme başarılı");
		
	}
	
	@Override
	public DataResult<ProductDto> getByProductId(int id) {
		Product product = productDao.findById(id);
		ProductDto productDto = convertToProductDto(product);
		return new SuccessDataResult<ProductDto>(productDto,"data listelendi");
	}

	@Override
	public Result delete(int id) {
		
		productDao.deleteById(id);
		return new SuccessResult("silme başarılı");
	}
	//produt değişkenide gelen verileri productdto değişkenine çeviren method.
	private ProductDto convertToProductDto(Product product)
	{
		ProductDto productDto = new ProductDto();
		productDto.setId(product.getId());
		productDto.setName(product.getName());
		productDto.setPrice(product.getPrice());
		productDto.setDescription(product.getDescription());
		productDto.setAvailable(product.getAvailable());
		return productDto;
	}
	//produtdto değişkenide gelen verileri product değişkenine çeviren method.
	private Product convertToProduct(ProductDto productDto) {
		Product product = new Product();
		product.setId(productDto.getId());
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		product.setDescription(productDto.getDescription());
		product.setAvailable(productDto.getAvailable());
		return product;
	}
	

}