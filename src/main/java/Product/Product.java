package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

	private long id;
	private String name;
	private Double price;

	public Product(long id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		// Busco productos mayores a 999
		searchPrice((double) 999);

		 
	        
	}

	static List<Object> getProducts() {

		List<Object> products = new ArrayList<Object>();
		products.add(new Product(1, "Notebook", 1000));
		products.add(new Product(2, "Tablet", 500));
		products.add(new Product(3, "Pc", 800));

		return products;

	}

	/**
	 * Retorna el id del Producto
	 * 
	 * @return
	 */

	public long getId() {
		return id;
	}

	/**
	 * Asigna o Modifica el id del Producto
	 * 
	 * @return
	 */

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Retorna el nombre del Producto
	 * 
	 * @return
	 */

	public String getName() {
		return name;
	}

	/**
	 * Asigna o Modifica el nombre del Producto
	 * 
	 * @return
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Retorna el precio del Producto
	 * 
	 * @return
	 */

	public Double getPrice() {
		return price;
	}

	/**
     * Asigna o Modifica el precio del Producto
     * @return
     */

    public void setPrice(Double price) {
        this.price = price;
    }


    public static List searchPrice(Double price) {
    	List products=getProducts();
    	Double prices=price;

    	List pds = (List) products.stream().filter(product -> ((Product) product).getPrice() > prices).
            map(p -> ((Product) p).getName()).collect(Collectors.toList());
    	pds.forEach(System.out::println); 
    	return pds;
    }
    		
    	 
    		


}