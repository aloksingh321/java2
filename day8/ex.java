class parent 
{
	int x;
	public void setx(int x)
	{
	this.x=x;
	}
	public void displayx()
	{
	System.out.println(x);
	}
}
class child extends parent
{
	int x;
	public void setxq(int x)
	{
	this.x=x;
	}
}
class subchild extends parent
{
	int x;
	//int x;
	public void setx(int x)
	{
	this.x=x;
	}

	public void displayx()
	{
	System.out.println(super.x);
	}
}
class main
{
public static void main(String args[])
{
	parent sc= new subchild();
	sc.setx(10);
	sc.displayx();
}
}