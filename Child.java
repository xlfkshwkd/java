class Parent
{ 
	Parent()
    {
        System.out.print("Parent");
    }
} 
public class Child  extends Parent
{ 
    public static void main(String[] args)
    { 
        new Child(); 
        new Parent(); 
    } 
}