
package labtask9;
// @author SP20-BSCS-0021

import java.util.Scanner;

public class LabTask9 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Press 1 for task 1\nPress 2 for task 2\nPress 3 for task 3\nPress 4 for task 4\nPress 5 for task 5");
        int i=input.nextInt();
        switch(i)
        {
        case 1:
        {            
        child1 obj0=new child1();
        obj0.message();
        child2 obj1=new child2();
        obj1.message();
        break;
        }
        case 2:
        {    
        BankA obj3=new BankA();
        obj3.getbalance(100);
        BankB obj4=new BankB();
        obj4.getbalance(150);
        BankC obj5=new BankC();
        obj5.getbalance(200);
        break;
        }
        case 3:
        {    
        SubClass obj6=new SubClass();
        obj6.a_method();//when we call overide method then automatically the parent class method are calling
        obj6.method();//when we call non abstract method then automatically the parent class method are not calling
         break;
        }
        case 4:
        {    
        Dog obj7=new Dog();
        obj7.dog();
        Cat obj8=new Cat();
        obj8.cat();
         break;
        }
        case 5:
        {        
        Area obj9=new Area();
        obj9.RectangleArea(5.2f, 2.2f);
        obj9.SquareArea(2.4f);
        obj9.CircleArea(2.4f);
        }
        }        
    }
    
}
/////////////////////////////////////////////////////////task 1////////////////////////////////////////////-----
abstract class Parent
{
    abstract void message(); 
}
class child1 extends Parent
{
    void message()
    {
        System.out.println("This is first child class");
    }        
}
class child2 extends Parent
{
    void message()
    {
        System.out.println("This is Second child class");
    }        
}
////////////////////////////////////////////////////////task 2/////////////////////////////////////////////////------
abstract class Bank
{
    abstract int getbalance(int deposited); 
}
class BankA extends Bank
{
    int deposited;
    int getbalance(int deposited)
    {
        
        this.deposited=deposited;
        System.out.println("The DEPOSITED MONEY IS : "+deposited);
        return 0;
    }        
}
class BankB extends Bank
{
    int deposited;
    int getbalance(int deposited)
    {
        this.deposited=deposited;
        System.out.println("The DEPOSITED MONEY IS : "+deposited);
        return 0;
    }        
}
class BankC extends Bank
{
    int deposited;
    int getbalance(int deposited)
    {
        this.deposited=deposited;
        System.out.println("The DEPOSITED MONEY IS : "+deposited);
        return 0;
    }        
}
////////////////////////////////////////////////////////task 3///////////////////////////////////////////////////----------
abstract class Parentclass
{
    Parentclass()
    {
        System.out.println("THIS IS CONSTRUCTOR OF PARENT CLASS");
    }
    abstract void a_method();
    void method()
    {
        System.out.println("THIS IS NORMAL METHOD OF ABSTRACT CLASS");
    }        
}
class SubClass extends Parentclass
{
    void a_method()
    {
        System.out.println("THIS IS ABSTRACT METHOD");
    }       
}
///////////////////////////////////////////////////////////////task 4///////////////////////////////////////////-----
abstract class Animal
{
    abstract void cat();
    abstract void dog();
}
class Cat extends Animal
{
    void cat()
    {
        System.out.println("Cats meow");
    }  
    void dog(){}//i use this method because program are not excute
}
class Dog extends Animal
{
    void dog()
    {
        System.out.println("DOG Bark");
    }
    void cat(){}//i use this method because program are not excute
}
/////////////////////////////////////////////////////////////////task 5//////////////////////////////////////-----
abstract class Shape
{
    abstract void RectangleArea(float length,float breadth);
    abstract void SquareArea(float side);
    abstract void CircleArea(float radius);         
}
class Area extends Shape
{
    float length;
    float breadth;
    float side;
    float radius;
    float RectangleArea;
    float SquareArea;
    double CircleArea;
      void RectangleArea(float length,float breadth)
      {
          this.breadth=breadth;
          this.length=length;
          float RectangleArea=length*breadth;
          System.out.println("The Area of Rectangle is : "+RectangleArea);
          
      }        
     void SquareArea(float side)
     {
         this.side=side;
         SquareArea=side*side;
         System.out.println("The Area of Square is : "+SquareArea);
         
     }       
     void CircleArea(float radius)
     {
         this.radius=radius;
         CircleArea=3.142*(radius*radius);
         System.out.println("The Area of Circle is : "+CircleArea);
         
     }        
}