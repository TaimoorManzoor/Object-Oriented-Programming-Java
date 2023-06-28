package lab8task1;

import java.util.Scanner;

public class Lab8Task1
{
    public static void main(String[] args) 
    {
        System.out.println("Press 1 for task 1\nPress 2 for task 2\nPress 3 for task 3\nPress 4 for task 4\nPress 5 for task 5\nPress 6 for task 6\nPress 7 for task 7\nPress 8 for task 8\n");
        Scanner input =new Scanner(System.in);
        int i=input.nextInt();
        switch(i)
        {
            case 1:
            {
                PrintNumber object=new PrintNumber();  
                object.printn(12);
                object.printn(22.32223);
                object.printn(13.2f);
                break;
            }
            case 2:
            {
                task2 object1=new task2();
                object1.method(12,'A');
                object1.method('A',12);
                break;
            } 
            case 3:
            {
                task3 object2=new task3();
                object2.Area(12.0f,15.0f);
                object2.Area(12.0f);
                break;
            }
             case 4:
            {
                Student object3[]= new Student[6];
                for (int j = 0; j < 5; j++) 
                {
                object3[j]=new Student();
                }
                System.out.println("==========First Method=======");
                object3[0].Setinfo("Muhmmad", 16);
                object3[1].Setinfo("Abu Baker", 16);
                object3[2].Setinfo("Umer", 16);
                object3[3].Setinfo("Usman", 16);
                object3[4].Setinfo("Ali", 16);
                System.out.println("==========Second Method=======");
                object3[0].Setinfo("Muhmmad", 16,"Karachi PAKISTAN DEFENCE");
                object3[1].Setinfo("Abu Baker", 16,"Lahore PAKISTAN DEFENCE");
                object3[2].Setinfo("Umer", 16,"Karachi PAKISTAN DEFENCE");
                object3[3].Setinfo("Usman", 16,"Lahore PAKISTAN DEFENCE");
                object3[4].Setinfo("Ali", 16,"Karachi PAKISTAN DEFENCE");   
                break;
            }
            case 5:
            {
                Degree object4=new Degree();
                object4.getDegree();
                Undergraduate object5=new Undergraduate();
                object5.getDegree();
                Postgraduate object6=new Postgraduate();
                object6.getDegree();
                break;
            } 
            case 6:
            {
                BankA object9=new BankA(1000);
                object9.getBalance();
                System.out.println("The deposite of Bank A is : "+object9.getBalance());
                BankB object10=new BankB(1500);
                object10.getBalance();
                System.out.println("The deposite of Bank B is : "+object10.getBalance());
                BankC object11=new BankC(2000);
                object11.getBalance();
                System.out.println("The deposite of Bank C is : "+object11.getBalance());
                break;
            }
             case 7:
            {
                task7Subclass object7=new task7Subclass();
                object7.printNum(6);
            } 
            case 8:
            {
              
                A object8=new B();
                object8.AB();
                break;
            } 
        }           
    } 
}   
class PrintNumber
{
    int num1;
    float num2;
    double num3;
    

    void printn(int num1)
    {
        System.out.println("=============Integer=============");
        System.out.println("The value of INTEGER  is : "+num1);
    }
    void printn(float num2)
    {
        System.out.println("==============float==========");
        System.out.println("The value of float 1 is :"+num2);
    }

     void printn(double num3)
    {
        System.out.println("==============double==========");
        System.out.println("The value of double  is :"+num3);

    }    
}
class task2
{
  void method(int num,char character)
    {
        System.out.println("======(int num,char character)======");
        System.out.println("The number is : "+ num);
        System.out.println("The character is "+character);
    }
     void method(char character,int num)
    {
        System.out.println("=======(char character,int num)=====");
        System.out.println("The character is "+character);
        System.out.println("The number is : "+ num);
    }   
}
class task3
{
    float Areaofreactangle;
    float Areaofsquare;
  void Area(float length, float breadth)
    {
        System.out.println("======(Area of Rectangle)======");
        Areaofreactangle=length*breadth;
        System.out.println("The area of Rectangle :  "+ Areaofreactangle);
    }
     void Area(float side)
    {
        System.out.println("=======(Area of Square)=====");
        Areaofsquare=side*side;
        System.out.println("The area of Square :  "+ Areaofsquare);
    }   
}
class Student
{
    String Name;
    int Age;
    String Address;
    Student()
    {
        Name="Unknown";
        Age=0;
        Address="Not available";
        
    }       
    void Setinfo(String Name,int Age)
    {
        this.Age=Age;
        this.Name=Name;
        System.out.println("The Name is : "+Age);
        System.out.println("The Age is  : "+Name);
        
    }
    void Setinfo(String Name,int Age,String Address)
    {
         this.Age=Age;
        this.Name=Name;    
        this.Address=Address;
        System.out.println("The Name is : "+Age);
        System.out.println("The Age is  : "+Name);
        System.out.println("The Address is  : "+Address);
    }  
    
}

class Degree
{
    void getDegree()
    {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree
{
     @Override
     void getDegree()
    {
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree
{
    
     @Override
     void getDegree()
    {
        System.out.println("I  am a Postgraduate");
    }
}
class task7
{
    int i;
    void printNum(int i)
    {
        this.i=i;
        System.out.println("The value of integer i is : "+i);
    }
    
}
class task7Subclass extends task7
{
    int j;
    @Override
    void printNum(int j)
    {
        this.j=j;
        super.printNum(8);
        System.out.println("The value of integer j is : "+j);
    }   
}
class  A
{
    void AB()
    {        
        System.out.println("Parent");
    }
}
class B extends A
{
    void AB()
    {  
        super.AB();
        System.out.println("Child");
    }
}
class Bank
{
    int getBalance()
    {
        return 0;
    }                   
}
class BankA extends Bank
{
    int deposited;
    public BankA(int deposited) 
    {
        this.deposited = deposited;
    }
    @Override
    int getBalance()
    {
        return deposited;
    }
 }
class BankB extends Bank
{
      private int deposited;
    public BankB(int deposited) 
    {
      this.deposited = deposited;
    }
    @Override
    int getBalance()
    {
        return deposited;
    }
}
class BankC extends Bank
{
    private int deposited;
    public BankC(int deposited)
    {
        this.deposited = deposited;
    }   
    @Override
    int getBalance()
    {
        return deposited;
    }
}