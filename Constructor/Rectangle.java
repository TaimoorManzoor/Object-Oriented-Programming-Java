package rectangle;
/**
 * @author SP20-BSCS-0021
 */
public class Rectangle 
{
    int lenght;
    int breadth;
    int Area;
    Rectangle()
    {
        System.out.println("No Argument Constructor");
        System.out.println("The lenght is:"+lenght);
        System.out.println("The breadth is:"+breadth);
        Area=breadth*lenght;
       
    }
    Rectangle(int num)
    {
        lenght=breadth=num;
        System.out.println("One parameterized Constructor");
        System.out.println("The lenght is:"+lenght);
        System.out.println("The breadth is:"+breadth);
        Area=breadth*lenght;
    }
    Rectangle(int num1,int num2)
    {
        System.out.println("Two parameterized Constructor");
        lenght=num1;
        breadth=num2;
        System.out.println("The lenght is:"+lenght);
        System.out.println("The breadth is:"+breadth);
        Area=breadth*lenght;
     }  
    public void Area()
    {
        System.out.println("Area is:"+Area);
    }        
    
    public static void main(String[] args) 
    {
        Rectangle [] Taimoor=new Rectangle[3];
        Taimoor[0]=new Rectangle();
        Taimoor[1]=new Rectangle(5);
        Taimoor[2]=new Rectangle(4,5);
        System.out.println("============OUTPUT================");
        System.out.println("Area of No Argument Constructor");
        Taimoor[0].Area();
        System.out.println("Area of One parameterized Constructor");
        Taimoor[1].Area();
        System.out.println("Area of Two parameterized Constructor");
        Taimoor[2].Area(); 

        
    }

    
}
