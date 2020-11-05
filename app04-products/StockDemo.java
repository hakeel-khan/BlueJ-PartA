/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified By Hakeel Khan  
 * Date Accessed 02/11/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(100,  "IPad"));
        manager.addProduct(new Product(101,  "Iphone X"));
        manager.addProduct(new Product(102,  "I Mac"));
        manager.addProduct(new Product(103,  "Samsung Galaxy S10"));
        manager.addProduct(new Product(104,  "Samsung Fold"));
        manager.addProduct(new Product(105,  "I Phone 7"));
        manager.addProduct(new Product(106,  "I phone 6"));
        manager.addProduct(new Product(107,  "Nokia"));
        manager.addProduct(new Product(108,  "Samsung Galaxy S9"));
        manager.addProduct(new Product(109,  "Samsung Galaxy S7"));
        manager.addProduct(new Product(110,  "Samsung Galaxy S6"));
    }
    
    /**
     * this should runn all the tests which it is needed for the demo
     */
    public void runDemo()
    {
        manager.printAllProducts();
        demoDeliverProducts();
        manager.printAllProducts();
        demoSellProducts();
        manager.printAllProducts();
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    private void demoDeliverProducts()
    {
        int quantity = 0;
        
       for(int id = 100; id < 110; id++) 
       {
           quantity++;
           manager.deliverProducts(id, quantity);
       } 
    }
    
        /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    private void demoSellProducts()
    {
        int quantity = 0;
        
       for(int id = 100; id < 110; id++) 
       {
           quantity++;
           manager.sellProduct(id, quantity);
       } 
    }
   

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
