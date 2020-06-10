package Product;

public class Product {

    private long id;
    private String name;
    private Double price;

    public Product() {
    }

    
    /**
     * Retorna el id del Producto
     * @return
     */

    public long getId() {
        return id;
    }
    
    /**
     * Asigna o Modifica el id del Producto
     * @return
     */

    public void setId(long id) {
        this.id = id;
    }
    
    /**
     * Retorna el nombre del Producto
     * @return
     */

    public String getName() {
        return name;
    }
    
    /**
     * Asigna o Modifica el nombre del Producto
     * @return
     */

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Retorna el precio del Producto
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


}