
/**
 * Write a description of class Course here.
 *
 * @author (Hakeel Khan)
 * @version (07/10/20)
 */
public class Course
{
    // Course codenumber 
    private String codeNumber;
    //Course title
    private String title;

    /**
     * Constructor for objects of class Course with parameters, codeNumber and title
     */
    public Course(String codeNumber, String title)
    {
        this.codeNumber = codeNumber; 
        this.title = title;
    }
//getting the value of the codenumber
    public String getCodeNumber()
    {
        return this.codeNumber;
    }
//getting the value of the title
    public String getTitle()
    {
        return this.title;
    }
}

    
    
   

