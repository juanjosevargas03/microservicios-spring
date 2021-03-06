//package com.spring.product;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import org.assertj.core.api.Assertions;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//
//import com.spring.product.entity.Category;
//import com.spring.product.entity.Product;
//import com.spring.product.repository.ProductRepository;
//
////@DataJpaTest
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ProductRepositoryMockTest {
//
//	@Mock
//    private ProductRepository productRepository;
//
//	@Before
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//        Product product01 = new Product((long) 4,"computer","",Double.parseDouble("10"),Double.parseDouble("1240.99"),"Created",new Date(),new Category(3L,"electronics") );
//		List<Product> productos = new ArrayList<Product>();
//		productos.add(product01);
//
//		//Mockito.when(productoServiceAPI.get((long) 1)).thenReturn(producto);
//		//Mockito.when(productoServiceAPI.save(producto)).thenReturn(producto);
//		Mockito.when(productRepository.findByCategory(product01.getCategory())).thenReturn(productos);
//
//	}
//	
//    @Test
//    public void whenFindByCategory_thenReturnListProduct(){
//    	
//        Product product01 = new Product((long) 4,"computer","",Double.parseDouble("10"),Double.parseDouble("1240.99"),"Created",new Date(),new Category(3L,"electronics") );
//                		
//        //productRepository.save(product01);
//
//        List<Product> founds= productRepository.findByCategory(product01.getCategory());
//
//        Assertions.assertThat(founds.size()).isEqualTo(1);
//
//
//    }
//}
