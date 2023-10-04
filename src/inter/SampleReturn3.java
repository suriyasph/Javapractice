package inter;
class SumReturn  
{  
    private int a;  
    public SumReturn(int i)  
    {  
        a = i;  
    }  
    /*The addition method returns a SumReturn object with adding 100 into it. */  
    public SumReturn addition()  
    {  
        SumReturn result = new SumReturn(a + 100); 
        return result;  
    }  
    public void display()  
    {  
        System.out.println("Additon result: " + a);  
    }  
}  
public class SampleReturn3  
{  
    /* Driver Code */  
    public static void main(String[] args)  
    {  
        SumReturn obj1 = new SumReturn(50);  
        obj1.display();  
        SumReturn obj2;  
        /* addition method returns a reference of SumReult class */  
        obj2 = obj1.addition();  
        obj2.display();  
    }  
}  