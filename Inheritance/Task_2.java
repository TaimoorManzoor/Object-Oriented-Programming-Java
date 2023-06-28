package task_2;
public class Task_2 
{
    public static void main(String[] args) 
    {
        System.out.println("=======================================");
        Employee object0=new Employee("ABCD",20,"R-204 KARACHI",35000,"Programming");
        object0.PrintE();
        System.out.println("=======================================");
        Manager object1=new Manager("ABC",25,"R-204 KARACHI",35000,"Computer Science");
        object1.PrintM();

    }
}
class Member
{
    String Name;
    int Age;
    String Address;
    int Salary;
    void printSalary()
    {
        System.out.println("The salary is : "+Salary);
    }        
}
class Employee extends Member
{
    String specialization;
    Employee(String Name ,int Age,String Address,int Salary,String specialization)
    {
        this.Name=Name;
        this.Age=Age;
        this.Address=Address;
        this.Salary=Salary;
        this.specialization=specialization;
    }        
    void PrintE()
    {
        System.out.println("The Name is : "+Name);
        System.out.println("The Age is : "+Age);
        System.out.println("The Address is : "+Address);
        System.out.println("The Salary is : "+Salary);
        System.out.println("The specialization in : "+specialization);
        
    }        
}
class Manager extends Member
{
    String Department;
    Manager(String Name ,int Age,String Address,int Salary,String Department)
    {
        this.Name=Name;
        this.Age=Age;
        this.Address=Address;
        this.Salary=Salary;
        this.Department=Department;
    }
    
    void PrintM()
    {
        System.out.println("The Name is : "+Name);
        System.out.println("The Age is : "+Age);
        System.out.println("The Address is : "+Address);
        System.out.println("The Salary is : "+Salary);
        System.out.println("The Department is : "+Department);
    }   
}