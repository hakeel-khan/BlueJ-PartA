
/**
 * Here we have the course class and in here we have the 4 modules.
 * @version 0.1 11/Sep/2020
 */
public class Course
{
    // Here we have the codeNo class
    private String codeNo;
    // Here we have the title class
    private String title;
    // here is the class for module1
    private Module module1;
    // here is the class for module2
    private Module module2;
    // here is the class for module3
    private Module module3;
    // here is the class for module4
    private Module module4;
    //here we have the class for finalMark
    private int finalMark;
    // here we have the class for finalGrade
    private Grades finalGrade;
        
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Computer Architecture", "CO450");
        module3 = new Module("Application Programming", "CO453");
        module4 = new Module("Web Development", "CO456");
        //todo add the others
    }
    
    /**
     * Here we have the addMark method and added all the modules.
     */
    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        if(moduleNo == 4)
        {
            module4.awardMark(mark);
        }
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    /**
     * here we have the convertToGrade method.
     */
    public Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 40))
        {
            return Grades.F;
        }
        
        return Grades.X;
    }
}
