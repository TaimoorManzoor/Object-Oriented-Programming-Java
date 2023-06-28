
package collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection {

    public static void main(String[] args) 
    {
      list obj=new list();

      obj.AddString();
      obj.Forloop();
      obj.AddElement();
      obj.Retrieve();
      obj.Update();
      obj.Remove();
      obj.Search();
      obj.sort();
      obj.REVERSE();
      obj.empty();
      obj.Isempty();
      obj.Copy();
      obj.Replace();
    }

 
    
}
    //  question 1
class list
{
    ArrayList a=new ArrayList();// object class like scanner class


    public void AddString()
    {
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.println("The Color Array list is : ");
        System.out.println(a);//print the element

    } 
        //  question 2
        public void Forloop()
    {
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.println("The Color Array list is : ");
        for (int i = 0; i < a.size(); i++)
        {
            System.out.println(""+a.get(i));
        }
    }
            //  question 3
    public void AddElement()
    {
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.println("Before Adding element");
        System.out.println(a);
        a.add(0, "Orange");//adding element in the first position
        System.out.println("After Adding element");
        System.out.println(a);
    }
        //  question 4
    public void Retrieve()
    {
        Scanner input=new Scanner(System.in);
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.print("Enter the element for retrive : ");
        int i=input.nextInt();
        System.out.println(a.get(i));
    }
        //  question 5
        public void Update()
    {
        Scanner input=new Scanner(System.in);
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.print("Remove ");
        int i=input.nextInt();
        String n=input.next();
        a.set(i, n);
        System.out.println(a); 
    } 
     public void Remove()
    {
        Scanner input=new Scanner(System.in);
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.print("Before Remove ");
        System.out.println(a);
        a.remove(3);
         System.out.print("AFTER Remove ");
        System.out.println(a); 
    } 
      //  question 7
    public void Search()
    {
        Scanner input=new Scanner(System.in);
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.print("Enter the element for retrive : ");
        boolean c=a.contains("Bldsaue");
        System.out.println(""+c);
    }
    //question 8
    public void sort()
    {
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.println("Before Sorting");
        System.out.println(""+a);  
        Collections.sort(a);
        System.out.println("After Sorting");
        System.out.println(""+a);
    }  
    //question 10
    public void REVERSE()
    {
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.println("Before Reversing");
        System.out.println(""+a);  
        Collections.reverse(a);
        System.out.println("After Reversing");
        System.out.println(""+a);
    } 
    //Question:11
    public void empty()
    {
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.println("Before Empty");
        System.out.println(""+a);  
        a.clear();
        System.out.println("After Empty");
        System.out.println(""+a);
    }
    //Question: 12
      public void Isempty()
    {
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.println("Is it Empty is : "+a.isEmpty());
    }
      
    public void Copy()
    {
        List<Integer> li = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        li.add(2);
        li.add(44);
        li2.add(2);
        li2.add(6);
        System.out.println(li2);
        System.out.println(li);
        Collections.copy(li2, li);
        System.out.println(li2);
        System.out.println(li);
    }
    //question :13
    public void Replace()
    {
        a.add("Purple");//add the element
        a.add("Red");
        a.add("Blue");
        a.add("White");
        System.out.println(a);
        a.remove(2);
        a.add(2, "SD");
        System.out.println(""+a);
    }
    
}