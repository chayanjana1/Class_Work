package Oopsdemo;
class Animal
{
	public void display()
	{
		System.out.println("Animal");
	}
	}
class Dog extends Animal
{
	public void dog()
	{
		System.out.println("Dog is barkeing..");
	}
	}
class Puppy extends Dog{
	public void puppy()
	{
		System.out.println("Child of dog");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Puppy puppy=new Puppy();
		puppy.display();
		puppy.dog();
		puppy.puppy();

	}

}