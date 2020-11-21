 import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Hakeel Khan) 
 * @version (03/11/20)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * here we have a stockmanager and it includes a array list
     */
    public StockManager()
    {
        stock = new ArrayList<>();
        
    }

    /**
     * here we have a method which can add a product
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * here on the deliver product we will deliver the product, but at 
     * first we will have to find the product
     * 
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id);
        
        if (product != null)
        {
        product.deliver(amount);
        System.out.println("Product Delivered : " + product); 
        }
        else
        {
            System.out.println("Product" + id + "cannot be found!");
        } 
    }
    
        /**
     * here on the deliver product we will deliver the product, but at 
     * first we will have to find the product
     * 
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        
        if (product != null)
        {
        stock.remove(product);
        System.out.println("\nProduct" + product + "removed!\n"); 
        }
        else
        {
            System.out.println("Invalid Product ID = " + id );
        } 
    }
    
      /**
     * here we are selling the product. 
     */
    public void sellProduct(int id, int quantity)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            if(quantity > product.getQuantity())
                quantity = product.getQuantity();
                
            printProduct(id);
            
            for(int count = 0; count <= quantity; count ++)
            { 
            product.sellOne();
            }
            
            printProduct(id);
        }
    }
    
     /**
     * here we will print the details of the product.
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * here we are finding the product
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
              return product;  
            }
        }
        return null;
    }
    
    /**
     * renaming a product. 
     */
    public void changeProductName(int id, String replacement)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.setName(replacement);
        }
        else
        {
            System.out.println("The product is not found on the database");
        }
    }
    
    /**
     * here we are finding the product by its name
     */
    public Product findByName(String productName)
    {
        for (Product product : stock)
        {
            if (product.getName().contains(productName))
            {
                System.out.println("Product found: " + product);
            }
            else 
            {
                System.out.println("Product name not found.");
            }
        }
        return null;
    }
    
    /**
     * here we have the numberinStock.
     */
    public void numberInStock(int id)
    {
       Product product = findProduct(id);
       if (product.getQuantity() > 0)
       {
            System.out.println("Stock remaining: " + product.getQuantity());
       }
       else 
       {
            System.out.println("There is no stock remaining.");
       }
    }
    
    /**
     * here we are printing the product
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Print details of all the products.
     */
    public void printAllProducts()
    {
     System.out.println();
     System.out.println("Hakeel's stock list");
     System.out.println("====================");
     System.out.println();
     
     if(stock.size() == 0)
     {
        System.out.println("You have no Stock");
     }
     {
     for(Product product : stock)
     {
         System.out.println(product);  
     }
     }
     
     System.out.println();
    }
    
    /**
     * here we are printing the stocklist
     */
    public void printStocklist()
    {
       printHeading();
       for(Product product : stock)
        {
            System.out.println(product);
        }
    }
    
    /**
     * here we are printing the heading
     */
    public void printHeading()
    {
        System.out.println("Stock List");
        System.out.println("==========");
        System.out.println();
    }
}
