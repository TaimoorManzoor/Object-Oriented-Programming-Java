package task_1;
public class Task_1 
{
    public static void main(String[] args) 
    {
       System.out.println("1 - method of parent class by object of parent class");
       Parent object0=new Parent();
       object0.parent();
       System.out.println("2 - method of child class by object of child class");
       Child object1=new Child();
       object1.child();
       System.out.println("3 - method of parent class by object of child class");
       Child object2=new Child();
       object2.parent();
    }
}
class Parent 
{
    void parent()
    {
        System.out.println("This is parent class");
    }        
}
class Child extends Parent 
{
    void child()
    {
        System.out.println("This is child class");
    }        
}