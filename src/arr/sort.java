package arr;

public class sort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int a[]= {4,6,3,5,0,-1};
        for(int i=0;i<a.length;i++)
        {   
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]<a[j])
        		{   int t=a[i];
        			a[i]=a[j];
        			a[j]=t;
        		}
        	}
        	
        }
        for(int i=0;i<a.length;i++)
        {   
        	System.out.println(a[i]);
        }
	}

}
