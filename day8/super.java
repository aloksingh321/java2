class parent 
{
int x;
public void getvalue(int x)
{
	this.x=x;
}	
public void display()
{
	System.out.println("parent class "+x);
}
}
class child extends parent
{
	int x;
	public void getvalue()
	{
   this.x=x;
	}
	public void display()
	{
		super.display();
	System.out.println("child class" +x);
	}
}
class main
{
	public static void main(String args[])
	{
parent sc= new child();
    sc.getvalue(10);
   sc.display();

	}
}