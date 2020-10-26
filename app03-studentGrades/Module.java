
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = -1;
        this.title = title;
        this.codeNo = codeNo;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public String getcodeNo()
    {
        return this.codeNo;
    }
    
    public int getMark()
    {
        if(this.mark == -1)
        {
            System.out.println(" no mark for this module!");
        }
        return this.mark;
    }
        
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
        }
        else
        {
            System.out.print("Invalid mark!!!");
        }
    }   
 
    public void print()
    {
        System.out.println("Module: " + codeNo +
            " " + title + " Mark = " + mark);
        System.out.println("percentage will be the same as the original mark");
        
    }

}
