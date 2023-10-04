package inter;
interface rules
{
	void dresscode();
	void time();
	void idcard();
}

public class employee implements rules
{
    private String name;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	}

	public void dresscode() {
		// TODO Auto-generated method stub
		System.out.println("dresscode");
	}

	public void time() {
		// TODO Auto-generated method stub
		System.out.println("time");
	}
 
	
	public void idcard() {
		// TODO Auto-generated method stub
		System.out.println("idcard");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
