package task_3;
public class Task_3
{
    public static void main(String[] args) 
    {
      System.out.println("===Calling by parent object of parent class===");   
      Rectangle object=new Rectangle(4.2f,6.2f);
      object.area();
      object.perimeter();
      System.out.println("===Calling by child object of parent and child method===");
      Square object1=new Square(4.2f);
      object1.areaSquare();
      object1.perimeterSquare();
      
      
    }
}        
class Rectangle
{
    float length;
    float breadth;
    float Area;
    float Perimeter;
    Rectangle(float length,float breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }        
    void area()
    {
        Area= length*breadth;
        System.out.println("The Area of the Rectangle is :  " +Area);
    }
    void perimeter()
    {
        Perimeter = 2*(length+breadth);
        System.out.println("The Perimeter of the Rectangle is :  " +Perimeter);
    }
}
class Square extends Rectangle
{
    float side;
        Square(float side)
    {
        super(side,side);
        this.side=side;
    }        
    void areaSquare()
    {
        super.area();
        Area= side*side;
        System.out.println("The Area of the Square is :  " +Area);
    }
    void perimeterSquare()
    {
        super.perimeter();
        Perimeter = 2*(side+side);
        System.out.println("The Perimeter of the Square is :  " +Perimeter);
    }
}
