package interfacetask;
import java.util.Scanner;
/**
 * @author SP20-BSCS-0021
 **/
public class InterfaceTask 
{
    public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      
      System.out.println("Press 1 for question 1\nPress 2 for question 2\nPress 3 for question 3\nPress 4 for question 4");
      int i=input.nextInt();
      switch(i)
      {
          case 1:  
          {  
                IVehicle object1=new Car(0);
                System.out.print("Enter the amount of gasoline");
                int gasoline=input.nextInt();
                object1.Refuel(gasoline);
                object1.Drive();
                boolean resulth=object1.Refuel(gasoline);
                System.out.println("The resulth is : "+resulth);
                break;
          }
          case 2:  
          {  
                Iinterface object2=new MyClass();
                object2.meth1();
                object2.meth2();
                break;
          } 
          case 3:  
          {  
                ToTestInt object3=new ToTestInt();
                object3.method();
                break;
          }
          case 4:  
          {  
               System.out.println("According to the question implementation is require only");
                break;
          } 
      }       
      
      
    }
    
}
//Question 1
interface IVehicle
{
    public void Drive();
    public boolean Refuel(int gasoline); 
}
class Car implements IVehicle
{
    int gasoline;
    public Car(int gasoline) 
    {
         this.gasoline=gasoline;
    }
    public void Drive()
    {
         if(gasoline>0)
        {
            System.out.println("The car is driving");
        }
        else
        {
            System.out.println("The car is not driving");
        }    
    }
    @Override
    public boolean Refuel(int gasoline)
    {
        if(gasoline>0)
        {
          this.gasoline+=gasoline; 
          return true;
        }
        else
        {
            return false;
        }    
        
    } 
}
//Question 2
interface Iinterface
{
    void meth1();
    void meth2();
}
class MyClass implements  Iinterface
{
    public void meth1()
    {
        System.out.println("I am method 1");
    }         
    public void meth2()
    {
        System.out.println("I am method 2");
    }        
}
//Question 3
interface ITest
{
    void square(int n);
}
class Arithmetic implements ITest
{
   int square;
    public void square(int n)
    {
         square=n*n;
        System.out.println("The square is : "+square);
    }        
}
class ToTestInt //extends Arithmetic
{
    void method()
    {
        Arithmetic obj=new Arithmetic();
        obj.square(5);
    }        
}
//Question 4
interface Payable
{
    double getPaymentAmount();
}
class Employee implements Payable
{
    private String firstname;
    private String lastname;
    private String socialsecurity;

    public Employee(String firstname, String lastname, String socialsecurity)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.socialsecurity = socialsecurity;
    }

    public String getFirstname() 
    {
        return firstname;
    }

    public String getLastnmae() 
    {
        return lastname;
    }

    public String getSocialsecurity()
    {
        return socialsecurity;
    }

    @Override
    public double getPaymentAmount() 
    {
        return 0;
    }
}
class Invoice implements Payable
{
    private String partnumber;
    private String partdescription;
    private int qunatity;
    private double PricePerItem;

    public Invoice(String partnumber, String partdescription, double PricePerItem) 
    {
        this.partnumber = partnumber;
        this.partdescription = partdescription;
        this.PricePerItem = PricePerItem;
    }
    public String getPartnumber() 
    {
        return partnumber;
    }

    public String getPartdescription()
    {
        return partdescription;
    }

    public int getQunatity()
    {
        return qunatity;
    }

    public double getPricePerItem()
    {
        return PricePerItem;
    }

    @Override
    public double getPaymentAmount()
    {
        return 0;
    } 
}
class ComissionEmployee extends Employee 
{
    private double grossSales;
    private double CommissionRate;

    public ComissionEmployee(double grossSales, double CommissionRate) 
    {
        
        this.grossSales = grossSales;
        this.CommissionRate = CommissionRate;
    }

    public double getGrossSales()
    {
        return grossSales;
    }

    public double getCommissionRate() 
    {
        return CommissionRate;
    }
}
class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;

    public HourlyEmployee(double wage, double hours) 
    {   
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage()
    {
        return wage;
    }

    public double getHours()
    {
        return hours;
    }
}
class salariedEmployee extends Employee
{
    private double weekSalary;
    

    public salariedEmployee(double weekSalary) 
    {
        this.weekSalary = weekSalary;
    }
    public double getWeekSalary() 
    {
        return weekSalary;
    }
}
class BasePlusComissionEmployee extends ComissionEmployee
{
    private double basesalary;

    public BasePlusComissionEmployee(double basesalary) 
    {
        this.basesalary = basesalary;
    }

    public double getBasesalary() 
    {
        return basesalary;
    }
    
    
}