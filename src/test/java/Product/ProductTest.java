package Product;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	private Product p1=new Product(0, null, 0);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testgetId() {
		p1.setId(2);
		assertEquals(2,p1.getId());
	}
	
	@Test
	void testgetName() {
		p1.setName("Notebook");
		assertEquals("Notebook",p1.getName());
	}
	
	
	@Test
	void testgetPrice() {
		p1.setPrice((double) 1000);
		assertEquals(1000,p1.getPrice());
	}
	
	@Test
	void testSearchPrice() {
		List pro=Product.searchPrice((double) 999);
		assertEquals(1,pro.size());
	}
	
	



}
