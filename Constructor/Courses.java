package courses;
/**
 * @author SP20-BSCS-0021
 */
public class Courses 
{
    String Courses1;
    String Courses2;
    String Courses3;
    Courses()
    {
        System.out.println("I am not enrolled in any course yet");
    }
    Courses(String Courses1,String Courses2,String Courses3)
    {
        this.Courses1=Courses1;
        this.Courses2=Courses2;
        this.Courses3=Courses3;
        System.out.println("I am enrolled the course is:"+Courses1+"\t"+Courses2+"\t"+Courses3);  
    }
        
    public static void main(String[] args)
    {
       Courses [] Taimoor=new Courses[2]; 
       Taimoor[0]=new Courses();
       Taimoor[1]=new Courses("Hindi","English","Urdu");
    }
    
}
