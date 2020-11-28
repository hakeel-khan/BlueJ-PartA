/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Hakeel Khan 
 * @version 0.1
 */
public class StockApp
{

    public final int FIRST_ID = 111;

    // Use to get user input
    private InputReader input;

    private StockManager manager;

    private StockDemo demo;

    private int nextID = FIRST_ID;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);

    }

    /**
     * here we will run the Menu
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getInput();
            choice = choice.toLowerCase();

            executeMenuChoice(choice);
            if(choice.equals("quit"))
                finished = true;
            else
                executeMenuChoice(choice);
        }
    }

    /**
     * choice method so we can execute the menu choice
     */
    public void executeMenuChoice(String choice)
    {
        if(choice.equals("add"))
        {
            addProduct();
        }
        else if (choice.equals("remove"))
        {
            removeProduct();
        }
        else if (choice.equals("printall"))
        {
            printAllProducts();
        }
        else if (choice.equals("deliver"))
        {
            deliverProduct();
        }
    }

    /**
     * here is the add product method.
     */
    public void addProduct()
    {
        System.out.println("add a product");
        System.out.println();

        System.out.println(" Enter the name of the product");
        String name = input.getInput();

        Product product = new Product(nextID, name);
        manager.addProduct(product);

        System.out.println("you have added this" + product);
        nextID++;
    }

    /**
     * here is the remove product method
     */
    public void removeProduct()
    {
        System.out.println("Remove an old product");
        System.out.println();

        System.out.println("Enter the id of the product");
        String number = input.getInput();

        int id = Integer.parseInt(number);
        manager.removeProduct(id);
    }

    /**
     * here is the deliver product method
     */
    public void deliverProduct()
    {
        System.out.println("Deliver a quantity of product");
        System.out.println();

        System.out.println("Enter the ID of the product");
        String number = input.getInput();

        int id = Integer.parseInt(number);

        System.out.println( "How much of the product would you like?");
        String amount = input.getInput();

        int amount1 = Integer.parseInt(amount);

        manager.deliverProduct(id, amount1);

        System.out.println("\nProduct Added : " + amount + " product in the stock" ); 
        nextID++;
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println("    Deliver:    Deliver the product");
        System.out.println();        
    }

    /**
     * here is the print all products method.
     */
    public void printAllProducts()
    {
        manager.printAllProducts();
    }    

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Hakeel Khan");
        System.out.println("******************************");
    }
}
