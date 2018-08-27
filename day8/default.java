class parent 
{
int a;
int b;
 parent()
 {
 System.out.println("alok singh");
 }
 parent(int a,int b)
 {
 this();
  this.a=a;
  this.b=b;
  System.out.print("a = "+this.a+" b = "+this.b);
 } 
}
class main
{
	public static void main(String args[])
	{
	parent obj = new parent(10,12);

	}
}