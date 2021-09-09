package infonal.PayDayBank.business.abstracts;

import java.util.List;

import infonal.PayDayBank.core.utilitis.results.DataResult;
import infonal.PayDayBank.core.utilitis.results.Result;
import infonal.PayDayBank.entities.dtos.ProductDto;


public interface ProductService {
	DataResult<List<ProductDto>> getall();
	Result add (ProductDto productDto);
	Result updateProduct(ProductDto productDto);
	DataResult<ProductDto>getByProductId(int productId);
	Result delete(int id);

}