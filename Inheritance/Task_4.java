package task_4;
public class Task_4 
{
    public static void main(String[] args) 
    {
        Square object=new Square();
        object.square();
    }
    
}
class Shape
{
     void shape()
     {
         System.out.println("This is a Shape");
     }       
}
class Circle extends Shape
{
     void circle()
     {
         System.out.println("This is a Circle");
     }    
}
class Rectangle extends Shape
{
     void rectangle()
     {
         super.shape(); 
         System.out.println("This is a Rectangle");
     } 
}
class Square extends Rectangle
{
      void square()
     {
         super.rectangle();
         System.out.println("Square is  a Rectangle");
     } 
}